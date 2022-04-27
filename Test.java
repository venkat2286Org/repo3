@RestController
public class Test {


    @GetMapping("/healthz")
    @ResponseBody
    public String healthz(){

        System.out.println("Healthy!");

        return "Healthy!";

    }
}
