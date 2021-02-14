public class First{
    public static void main(String[] args){
        //System.out.println(args.length);
        int [] numberArray = new int[5];

        String[] stringArray = new String[5];

        String name = "Johannes";
        int year = 2021;
        
        //for tsükkel    
        for(int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }

        //foreach tsükkel
        for(String text : args){
            System.out.println(text);
        }

        //while tsükkel
        int length = args.length;
        while(length>0){
            length--;
            System.out.println("Inside while");
        }

        System.out.println("Hello world!");
        System.out.println("Test two");
        System.out.println("Test two");
        
    }
}