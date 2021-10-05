public class string_methods {
    public static void main(String[] args) {
        String name = "   Bob  ";

        //boolean result = name.equals("bob");
        //boolean result = name.equalsIgnoreCase("bob");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("B");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('o', 'a');
    
        System.out.println(result);
        
    }
    
}
