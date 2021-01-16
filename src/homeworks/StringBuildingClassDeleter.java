package homeworks;

public class StringBuildingClassDeleter {
    public static void main(String[] args) {
        //        //        //delete all suffixes from company names.
        //        //        //DevXSchool LLC
        //        //        //CME Group Inc
        //        //        //Apple Inc
        StringBuilder companyName = new StringBuilder("DevXSchool LLC");
        int l = companyName.length();
      companyName.delete(l-3, l);
        System.out.println(companyName);

    }
}
