class ex007 {
    public static void main(String[] args) {
        
        int idade = 15;
        if (idade < 18){
            System.out.println("Nao pode entrar!");
        }else{
            System.out.println("Pode entrar!");
        }

        int mes = 1;
        if(mes == 1){
            System.out.println("Você deveria estar de férias!");
        }
        
        boolean amigoDoDono = true;
        if ( idade < 18 && !amigoDoDono ){
            System.out.println("Não pode entrar!");
        }else {
            System.out.println("Pode entrar, você é amigo do dono ne!");
        }
    }  

}