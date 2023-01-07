public class Kyu5 {
    public static boolean alphanumeric(String s){
        if(s.length()==0) return  false;
        String pattern = "[a-zA-z0-9]+";
        System.out.println("S: "+s+"\t");
        s = s.replaceAll(pattern,"");
        System.out.println("S: "+s+"\t");
        return s.length() == 0?true:false;
    }
}
