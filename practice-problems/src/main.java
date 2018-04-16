
public class main {

    public static void main(String[] args) {
        System.out.println(Problem9.getFirstRecurringChar("barnacle"));
        System.out.println(Problem6.orderByString("brrainteaser", "sitter"));

        
    }

    private static void TestProblem2() {
        Problem2_LRU<String> strCache = new Problem2_LRU<>(2);
        strCache.add("james");
        strCache.add("is");
        strCache.add("the"); // check the cache stays within capacity
        System.out.println(strCache.toString());
        strCache.add("coolest"); // confirm the LRU element is being removed
        System.out.println(strCache.toString());
        strCache.add("the"); // confirm the cache is correctly sorting when cache element used
        System.out.println(strCache.toString());
    }
}