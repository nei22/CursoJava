class ex009 {
    public static void main(String[]args){
        for(int i = 0; i < 10; ++i){
            System.out.println("Ola!");
        }
        
        int x = 0;
        for( int i = x; i < x; i++){
            if (i % 19 == 0){
                System.out.println("Achei um número divisivel por 19 entre x e y " + i + ".");
                break;
            }
        }
    }
}