//Gabriel Farah 512981

class Pilha {
   private Municipio [] array;
   private int topo;

   /**
    * Construtor da classe.
    */
   public Pilha () {
      this(500);
   }


   /**
    * Construtor da classe.
    * @param tamanho Tamanho da pilha.
    */
   public Pilha (int tamanho){
      array = new Municipio[tamanho];
      topo = 0;
   }


   /**
    * Insere um elemento na ultima posicao da pilha.
    * @param x int elemento a ser inserido.
    * @throws Exception Se a pilha estiver cheia.
    */
   public void inserir(Municipio x) throws Exception {

      //validar insercao
      if(topo >= array.length){
         throw new Exception("Erro ao inserir!");
      }

      array[topo] = x.clone();
      topo++;
   }


   /**
    * Remove um elemento da ultima posicao da pilha.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a pilha estiver vazia.
    */
   public Municipio remover() throws Exception {

      //validar remocao
      if (topo == 0) {
         throw new Exception("Erro ao remover!");
      }

      return array[--topo].clone();
   }


   /**
    * Mostra os array separados por espacos.
    */
   public void mostrar ()throws Exception{
      
     int x=0;
	
 	for (int i = topo - 1; i >= 0; i--) {

		array[x].imprimir();
		x++;
	}
   
   }


   /**
    * Retorna um boolean indicando se a pilha esta vazia
    * @return boolean indicando se a pilha esta vazia
    */
   public boolean isVazia() {
      return topo == 0; 
   }
}

public class PrincipalPilha{

    public static void main (String [ ] args) throws Exception{

   

     Municipio muni = new Municipio();

     Pilha pilha = new Pilha();

     String linha;
     linha = MyIO.readLine();

     //entrada e saida 

     while (Integer.parseInt(linha)!= 0){
    
        muni.ler(Integer.parseInt(linha)); //le os municipios

        pilha.inserir(muni); //cria piilha

        linha = MyIO.readLine();

    }

    String linha2;

    int x = Integer.parseInt(MyIO.readLine());

    for (int i = 0; i < x; i++ ) {

      linha2 = MyIO.readLine();

      //teste para metodos de inserçao e remorçao

      	if (linha2.charAt(0) == 'I') {      

        	String arrayAux[] = linha2.split(" ");
       	        muni.ler(Integer.parseInt(arrayAux[1]));
       	        pilha.inserir(muni);
         
        }
       else if(linha2.charAt(0)=='R') {

         	muni =  pilha.remover();

         	MyIO.println("(R) "+ muni.getNome());

       }

    }// end for

    pilha.mostrar(); //mostra lista

 }

}
