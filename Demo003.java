class Demo003{
    public static void main(String args[] ){
        int num1 = 90;
        int num2 = 65;
        int num3 = 35;
        if (num1 > num2 && num1 > num3){
            System.out.println(" Greater number is :"+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println(" Greater number is :"+num2);
        }else{
            System.out.println("Greatest number is : "+num3);
        }
    }
}
