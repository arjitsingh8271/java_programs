class oops_1_07_static_keyword_within_class
{
   static int age;

   static void display() {
       System.out.println("Static Method");
   }
   
   public static void main(String[] args) {

       age = 30;
       
       System.out.println("Age is " + age);     // Age is 30
       display();                               // Static Method
   }
}