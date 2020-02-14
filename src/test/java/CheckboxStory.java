import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class CheckboxStory extends JUnitStory {

    public CheckboxStory(){
        configuredEmbedder().embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(false)
                .doIgnoreFailureInView(true).useThreads(2);
    }

    @Override
    public Configuration configuration()
    {
        return  new MostUsefulConfiguration()
                .useStoryLoader(storiesURL.getstoriesURL() != null ?
                        new LoadFromRelativeFile(storiesURL.getstoriesURL()) : new LoadFromClasspath(this.getClass()));
    }

    @Override
    public InjectableStepsFactory stepsFactory()
    {
        return new InstanceStepsFactory(configuration(), new CheckboxSteps());
    }

}
