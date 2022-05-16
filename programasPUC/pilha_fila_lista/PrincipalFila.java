/*Gabriel Farah
 */
// Fila estatica 


import java.io.*;


class Municipio {

//declaraçao de variaves / localizaçoes

   private int id; // A1 todos
   private String nome; // A202 todos
   private String uf; // A201 todos
   private int codigoUf; // A200 variaveis externass
   private int populacao; // A204 variaveis externas
   private int numeroFuncionarios; // A2 recursos humanos
   private int numeroComissarios; //A5 recursos humanos
   private String escolaridade; // A16 planejamentoshurbano
   private String estagio; // A143 gestao ambiental
   private int atualizacaoPlano; // A18 planejamento urbano
   private String regiao; // A199 variaveis externas
   private int atualizacaoCadastro; // A63 recursos para gestao municipal
   private boolean consorcio; // A152 Articulaçao intermunicipal


   public Municipio(){
   
      this.id = 0;
      this.nome = "";
      this.uf = "";
      this.codigoUf = 0;
      this.populacao = 0;
      this.numeroFuncionarios = 0;
      this.numeroComissarios = 0;
      this.escolaridade = "";
      this.estagio = "";
      this.atualizacaoPlano = 0;
      this.regiao = "";
      this.atualizacaoCadastro = 0;
      this.consorcio = false;
   
   
   }
   
   public Municipio(int id,String nome,String uf,int codigoUf,int populacao,int numeroFuncionarios,int numeroComissarios,
   String escolaridade,String estagio,int atualizacaoPlano,String regiao,int atualizacaoCadastro,boolean consorcio){
   
      this.id = id;
      this.nome = nome;
      this.uf = uf;
      this.codigoUf = codigoUf;
      this.populacao = populacao;
      this.numeroFuncionarios = numeroFuncionarios;
      this.numeroComissarios = numeroComissarios;
      this.escolaridade = escolaridade;
      this.estagio = estagio;
      this.atualizacaoPlano = atualizacaoPlano;
      this.regiao = regiao;
      this.atualizacaoCadastro = atualizacaoCadastro;
      this.consorcio = consorcio;  
   } 
   // metodos get e set 

   public void setId(int id){
   
      this.id = id;
   }
   public int getId(){
   
      return id;
   }
   
   public void setNome(String nome){
   
      this.nome = nome;
   }
   public String getNome(){
   
      return nome;
   }
   
   public void setUf(String uf){
   
      this.uf = uf;
   }
   public String getUf(){
   
      return uf;
   }
   
   public void setCodigoUf(int codigoUf){
   
      this.codigoUf = codigoUf;
   }
   public int getCodigoUf(){
   
      return codigoUf;
   }
   
   public void setPopulacao(int populacao){
   
      this.populacao = populacao;
   }
   public int getPopulacao(){
   
      return populacao;
   }
   
   public void setNumeroFuncionarios(int numeroFuncionarios){
   
      this.numeroFuncionarios = numeroFuncionarios;
   }
   public int getNumeroFuncionarios(){
   
      return numeroFuncionarios;
   }
   
   public void setNumeroComissarios(int numeroComissarios){
   
      this.numeroComissarios = numeroComissarios;
   }
   public int getNumeroComissarios(){
   
      return numeroComissarios;
   }
      
   public void setEscolaridade(String escolaridade){
   
      this.escolaridade = escolaridade;
   }
   public String getEscolaridade(){
   
      return escolaridade;
   }
   
   public void setEstagio(String estagio){
   
      this.estagio = estagio;
   }
   public String getEstagio(){
   
      return nome;
   }

   public void setAtualizacaoPlano(int atualizacaoPlano){
   
      this.atualizacaoPlano = atualizacaoPlano;
   }
   public int getAtualizacaoPlano(){
   
      return atualizacaoPlano;
   }
  
   public void setRegiao(String regiao){
   
      this.regiao = regiao;
   }
   public String getRegiao(){
   
      return regiao;
   }

   public void setAtualizacaoCadastro(int atualizacaoCadastro){
   
      this.atualizacaoCadastro = atualizacaoCadastro;
   }
   public int getAtualizacaoCadastro(){
   
      return atualizacaoCadastro;
   }
   
   public void setConsorcio(boolean consorcio){
   
      this.consorcio = consorcio;
   }
   public boolean getconsorcio(){
   
      return consorcio;
   }

   public Municipio clone(){
         
         //criando objeto da classe
         Municipio municipio = new Municipio();

         // criando clones
         municipio.setId(this.id);         
         municipio.setNome(this.nome);
         municipio.setUf(this.uf);
         municipio.setCodigoUf(this.codigoUf);
         municipio.setPopulacao(this.populacao);
         municipio.setNumeroFuncionarios(this.numeroFuncionarios);
         municipio.setNumeroComissarios(this.numeroComissarios);
         municipio.setEscolaridade(this.escolaridade);
         municipio.setEstagio(this.estagio);
         municipio.setAtualizacaoPlano(this.atualizacaoPlano);
         municipio.setRegiao(this.regiao);
         municipio.setAtualizacaoCadastro(this.atualizacaoCadastro);
         municipio.setConsorcio(this.consorcio);

   return municipio;

   }

    public void imprimir(){

         System.out.print(this.id + " ");
         System.out.print(this.nome + " ");
         System.out.print(this.uf + " ");
         System.out.print(this.codigoUf + " ");
         System.out.print(this.populacao + " ");
         System.out.print(this.numeroFuncionarios + " ");
         System.out.print(this.numeroComissarios + " ");
         System.out.print(this.escolaridade + " ");
         System.out.print(this.estagio + " ");
         System.out.print(this.atualizacaoPlano + " ");
         System.out.print(this.regiao + " ");
         System.out.print(this.atualizacaoCadastro + " ");
         System.out.println(this.consorcio);
      }   

     public void ler (int linha) throws Exception { 

       String line = null;

      //leitura variaveis externas
      BufferedReader read = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/variaveisexternas.txt"), "ISO-8859-1"));
      

      line = read.readLine();
    for (int i = 0;i < linha;i++) {

      line = read.readLine();

    }
    String arrayVariExt[] = line.split("\t"); // array de Strings

    this.id = Integer.parseInt(arrayVariExt[0]);
    this.regiao = arrayVariExt[1];
    this.codigoUf = Integer.parseInt(arrayVariExt[2]);
    this.uf = arrayVariExt[3];
    this.nome = arrayVariExt[4];
    this.populacao = Integer.parseInt(arrayVariExt[6]);

    read.close();

    //planejamneto urbano

    BufferedReader read2 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/planejamentourbano.txt"), "ISO-8859-1"));

    line = read2.readLine();

    for (int i = 0;i < linha;i++) {

      line = read2.readLine();

    }
    String arrayPlanejUrb[] = line.split("\t");// array de Strings

    this.escolaridade = arrayPlanejUrb[5];

    try {

      this.atualizacaoPlano=Integer.parseInt(arrayPlanejUrb[8]);

    }catch (Exception e){
      this.atualizacaoPlano = 0;
    }

    read2.close();

    //recursos humanos
    BufferedReader read3 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/recursoshumanos.txt"), "ISO-8859-1"));

    line = read3.readLine();

    for (int i= 0;i < linha;i++) {

      line = read3.readLine();
    }

    String arrayRecHumano[] = line.split("\t"); // array de Strings dividido

    this.numeroFuncionarios= Integer.parseInt(arrayRecHumano[4]);
    this.numeroComissarios= Integer.parseInt(arrayRecHumano[7]);

    read3.close();

    //gestao ambiental
    BufferedReader read4 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/gestaoambiental.txt"), "ISO-8859-1"));

    line = read4.readLine();

    for (int i = 0;i < linha;i++) {

      line = read4.readLine();
    }

    String arrayGest[] = line.split("\t");// array de Strings

    this.estagio = arrayGest[7];

    read4.close();

    //articulacao

    BufferedReader read5 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/articulacaoointerinstitucional.txt"), "ISO-8859-1"));

    line = read5.readLine();

    for (int i = 0;i < linha;i++) {
      line = read5.readLine();
    }

    String arrayArticulacao[] = line.split("\t");// array de Strings

    if (arrayArticulacao[5].equals("Sim")) {

       this.consorcio = true;
    } else {
      this.consorcio = false;
    }

    read5.close();

    //recurso gestao
    BufferedReader read6 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/recursosparagestao.txt"), "ISO-8859-1"));

    line = read6.readLine();

    for (int i = 0;i < linha;i++) {

      line = read6.readLine();
    }

    String arrayRecGest[] = line.split("\t");
    try {

      this.atualizacaoCadastro = Integer.parseInt(arrayRecGest[6]);

    } catch (Exception oa) {
      this.atualizacaoCadastro = 0;
    }

    read6.close();   

    }

}

 */


class Fila {
   private Municipio[] array;
   private int primeiro; // Remove do indice "primeiro".
   private int ultimo; // Insere no indice "ultimo".


   /**
    * Construtor da classe.
    */
   public Fila () {
      this(6);
   }


   /**
    * Construtor da classe.
    * @param tamanho Tamanho da fila.
    */
   public Fila (int tamanho){
      array = new Municipio[tamanho+1];
      primeiro = ultimo = 0;
   }


   /**
    * Insere um elemento na ultima posicao da fila.
    * @param x int elemento a ser inserido.
    * @throws Exception Se a fila estiver cheia.
    */
   public void inserir(Municipio x) throws Exception {

      //validar insercao
      if (((ultimo + 1) % array.length) == primeiro) {
         throw new Exception("Erro ao inserir!");
      }

      array[ultimo] = x.clone();
      ultimo = (ultimo + 1) % array.length;
   }


   /**
    * Remove um elemento da primeira posicao da fila e movimenta 
    * os demais elementos para o primeiro da mesma.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a fila estiver vazia.
    */
   public Municipio remover() throws Exception {

      //validar remocao
      if (primeiro == ultimo) {
         throw new Exception("Erro ao remover!");
      }

      Municipio resp = array[primeiro].clone();
      primeiro = (primeiro + 1) % array.length;
      return resp;
   }


   /**
    * Mostra os array separados por espacos.
    */
   public void mostrar (){
      System.out.print("[ ");

      for(int i = primeiro; i != ultimo; i = ((i + 1) % array.length)) {
        array[i].imprimir();
      }

      System.out.println("]");
   }

   public void mostrarRec(){
      System.out.print("[ ");
      mostrarRec(primeiro);
      System.out.println("]");
   }

   public void mostrarRec(int i){
      if(i != ultimo){
         array[i].imprimir();
         mostrarRec((i + 1) % array.length);
      }
   }

   public int tamanho(){
   return array.length;
   }


   /**
    * Retorna um boolean indicando se a fila esta vazia
    * @return boolean indicando se a fila esta vazia
    */
   public boolean isVazia() {
      return (primeiro == ultimo); 
   }

   public boolean isCheia() {
        
        boolean cheia = false;
        
        if(((ultimo + 1) % array.length) == primeiro){

            cheia = true;
        }
    return cheia;
   }

   public double mediaSomatorio(){

   double result = 0;

	for(int i = 0;i < 6;i++){
		
		if(array[1] != null){

		  	result += array[i].getPopulacao();
		}
	}
	result = result / 6;
	return result;

}

public int arredondamento(double result){

	int valor = (int)result;
	double decimal = result - valor;

	if(decimal >=  0.5){

		valor = valor + 1;
}
	else if(decimal <  0.5){

		valor = valor;
	}

	return valor;
}


}

public class PrincipalFila{

public static void main (String [ ]args)throws Exception{
 	
	Municipio muni = new Municipio();

	Fila fila = new Fila(6);

	String linha = MyIO.readLine();

	while(Integer.parseInt(linha) != 0){


    if(fila.isCheia()) {
     muni = fila.remover();
    }
		
		muni.ler(Integer.parseInt(linha));
		fila.inserir(muni);

		if(fila.isCheia()){

		    muni = fila.remover();
       		 }	

        MyIO.println(fila.arredondamento(fila.mediaSomatorio()));
	      linha = MyIO.readLine();
        }

  
	int x = Integer.parseInt( MyIO.readLine());
	String linha2 ;

	for(int i = 0;i < x;i++){

	
		linha2 = MyIO.readLine();
    String arrayAux [] = linha2.split(" "); 
    

	
	if(arrayAux[0] == "I" ){

    //String arrayAux [] = linha2.split(" ");	


		muni.ler(Integer.parseInt(arrayAux[1]));
		fila.inserir(muni);
    
     if(fila.isCheia()== true) {
     muni = fila.remover();
    }
	}

	else if(arrayAux[0] == "R"){

               muni = fila.remover();

	}

	} // end for

	//fila.mostrar();
  }
}












