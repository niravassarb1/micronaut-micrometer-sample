package micronaut.micrometer.sample;

import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class IndexController {

    private MeterRegistry meterRegistry;

    public IndexController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        meterRegistry.counter("NiravAssarCounter").increment();
        return "Hello World";
    }
}
