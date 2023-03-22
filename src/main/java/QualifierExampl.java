import java.util.Formatter;


public class QualifierExampl {
}
//@Component("fooFormatter")
//class FooFormatter implements Formatter {
//
//    public String format() {
//        return "foo";
//    }
//}
//
//@Component("barFormatter")
//class BarFormatter implements Formatter {
//
//    public String format() {
//        return "bar";
//    }
//}
//
//@Component
//class FooService {
//
//    @Autowired
//    private Formatter formatter;
//}
//
//
//class FooService {
//    @Autowired
//    @Qualifier("fooFormatter")
//    private Formatter formatter;
//}
//If we try to load FooService into our context, the Spring framework will throw a NoUniqueBeanDefinitionException. This is because Spring doesn't know which bean to inject. To avoid this problem, there are several solutions; the @Qualifier annotation is one of them.
//It's worth noting that if both the @Qualifier and @Primary annotations are present, then the @Qualifier annotation will have precedence. Basically, @Primary defines a default, while @Qualifier is very specific.