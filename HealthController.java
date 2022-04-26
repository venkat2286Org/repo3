
@RestController
public class HealthController {


    @GetMapping("/healthz")
    @ResponseBody
    public String healthz(){

        System.out.println("Healthy!");

        return "Healthy!";

    }
}
