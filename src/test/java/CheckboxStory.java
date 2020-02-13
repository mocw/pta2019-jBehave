import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckboxStory extends JUnitStory {
    @Override
    public Configuration configuration()
    {
        URL storyURL = null;
        try {
            storyURL = new URL("file://" + System.getProperty("user.dir") + "" +
                    "\\src\\test\\resources\\stories");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return  new MostUsefulConfiguration()
                .useStoryLoader(storyURL != null ? new LoadFromRelativeFile(storyURL) : new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
    }

    @Override
    public InjectableStepsFactory stepsFactory()
    {
        return new InstanceStepsFactory(configuration(), new CheckboxSteps());
    }

}
