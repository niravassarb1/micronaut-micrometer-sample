package micronaut.micrometer.sample;

import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/hello")
public class IndexController {

    private MeterRegistry meterRegistry;

    public IndexController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        meterRegistry.counter("FirstCounterGet").increment();
        return "FirstCounterGet";
    }

    @Get("/another")
    @Produces(MediaType.TEXT_PLAIN)
    public String secondIndex() {
        meterRegistry.counter("SecondCounterGet").increment();
        return "SecondCounterGet";
    }

    @Post
    @Produces(MediaType.TEXT_PLAIN)
    public String thirdIndex() {
        meterRegistry.counter("ThirdCounterPost").increment();
        return "ThirdCounterPost";
    }

    @Delete
    @Produces(MediaType.TEXT_PLAIN)
    public String forthIndex() {
        meterRegistry.counter("FourthCounterDelete").increment();
        return "ForthCounterDelete";
    }

    @Put
    @Produces(MediaType.TEXT_PLAIN)
    public String fifthIndex() {
        meterRegistry.counter("FifthCounterPut").increment();
        return "FifthCounterPut";
    }
}
