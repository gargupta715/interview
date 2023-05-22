//
//
//@RestController
//@RequestMapping("/v2")
//public class TestController {
//
//
//    @PostMapping(value="saveObject", consumers="", producers)
//    @HystrixCommand()
//    ResponseEntiry<> saveEntity(@RequestBody Book book){
//        return ResponseEntity.ok().body();
//
//        RestTemplate
//
//    }
//
//    @HystrixCommand(fallbackmethod= getFallBack(), )// retry concept
//    public String getResponse(){
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getForObject("url", header,entiy);
//    }
//
//
//    public String getFallBack(){
//        return "Hello";
//    }
//}

////        AddNum sm = (a,b) -> a+b;
////        System.out.println(sm.addnum(10, 5));
//        // list of Account -> balance > 10000
////        List<Account>  newll = ll.stream().filter(a -> a.getBalance() > 10000).collect(Collectors.toList());
//        Random rm = new Random(10);
//        rm.ints().limit(10).forEach(System.out::println);
