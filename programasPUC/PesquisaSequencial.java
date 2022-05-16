import java.io.*;
import java.util.*;


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
      
      }
      catch (Exception e){
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
      } 
      else {
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
      
      } 
      catch (Exception oa) {
         this.atualizacaoCadastro = 0;
      }
   
      read6.close();   
   
   }

}

class ListaSequencial{

   private Municipio [] array;
   private int n;
   int comp = 0;

   public ListaSequencial () {
      this(500);
   }
/**
    * Construtor da classe.
    * tamanho Tamanho da listaSequencial.
    */
   public ListaSequencial (int tamanho){
      array = new Municipio[tamanho];
      n = 0;
   }
   
   public int getComp(){
      return comp;
   }

/**
    * Insere um elemento na primeira posicao da lista e move os demais
    * elementos para o fim da listaSequencial.
    *  x int elemento a ser inserido.
    *  Exception Se a lista estiver cheia.
    */
   public void inserirInicio(Municipio x) throws Exception {
    
      //validar insercao
      if(n >= array.length){
         throw new Exception("Erro ao inserir!");
      } 
   
      //levar elementos para o fim do array
      for(int i = n; i > 0; i--){
         
         array[i] = array[i-1].clone();
      }
   
      array[0] = x.clone();
      n++;
   }

/**
    * Insere um elemento na ultima posicao da listaSequencial.
    * @param x int elemento a ser inserido.
    * @throws Exception Se a lista estiver cheia.
    */
   public void inserirFim(Municipio x) throws Exception {   
   
      //validar insercao
      if(n >= array.length){
         throw new Exception("Erro ao inserir!");
      }
   
      array[n] = x.clone();
      n++;
   }


   /**
    * Insere um elemento em uma posicao especifica e move os demais
    * elementos para o fim da listaSequencial.
    * @param x int elemento a ser inserido.
    * @param pos Posicao de insercao.
    * @throws Exception Se a lista estiver cheia ou a posicao invalida.
    */
   public void inserir(Municipio x, int pos) throws Exception {
       
       //clona municipio
      Municipio muni = x.clone();
   
      //validar insercao
      if(n >= array.length || pos < 0 || pos > n){
         throw new Exception("Erro ao inserir!");
      }
   
      //levar elementos para o fim do array
      for(int i = n; i > pos; i--){
        
         array[i] = array[i-1].clone();
      }
   
      array[pos] = muni;
      n++;
   }


   /**
    * Remove um elemento da primeira posicao da lista e movimenta 
    * os demais elementos para o inicio da mesma.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a lista estiver vazia.
    */
   public Municipio removerInicio() throws Exception {
   
      //validar remocao
      if (n == 0) {
         throw new Exception("Erro ao remover!");
      }
   
      Municipio muni = array[0].clone();
      n--;
   
      for(int i = 0; i < n; i++){
        
         array[i] = array[i + 1].clone();
      }
   
      return muni;
   }


   /**
    * Remove um elemento da ultima posicao da listaSequencial.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a lista estiver vazia.
    */
   public Municipio removerFim() throws Exception {
   
      //validar remocao
      if (n == 0) {
         throw new Exception("Erro ao remover!");
      }
       
      Municipio muni = array[n-1].clone();
      n--;
   
      return muni;
   }
/**
    * Remove um elemento de uma posicao especifica da lista e 
    * movimenta os demais elementos para o inicio da mesma.
    * @param pos Posicao de remocao.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a lista estiver vazia ou a posicao for invalida.
    */
   public Municipio remover(int pos) throws Exception {
   
      //validar remocao
      if (n == 0 || pos < 0 || pos >= n) {
         throw new Exception("Erro ao remover!");
      }
      
      Municipio muni;
      muni = array[pos].clone();
      n--;
   
      for(int i = pos; i < n; i++){
         array[i] = array[i+1];
      }
   
      return muni;
   }
   
   public void mostrar (){
      //System.out.print("[ ");
      for(int i = 0; i < n; i++){
         array[i].imprimir();
      }
      //System.out.println("]");
   }
   
   public boolean pesquisar(int x) {
      boolean resp = false;
      
      for (int i = 0; i < n && resp == false; i++) {
         
         if(array[i].getId() == x){
         
            resp = true;
         }
         comp++;
      }
      
      return resp;
   }
   
}

class Log {

	/**
	 * metodo de criar log file
	 * @param countComp conta comparaçoes
	 * @param fim       tempo fim
	 * @param comeco    tempo comeco
	 */

   public static void createFile(int countComp, long fim, long comeco) {
      PrintWriter writer = null;
      try {
         writer = new PrintWriter("512981_binaria.txt", "ISO-8859-1");
      } 
      catch (FileNotFoundException e) {
         e.printStackTrace();
      } 
      catch (UnsupportedEncodingException e) {
         e.printStackTrace();
      }
      writer.println("504654 \t " + " Tempo:" + (fim - comeco) / 1000.0 + "s  \t " + "Comparacoes:" + countComp);
      writer.close();
   	//System.out.print(writer);
   
   
   }

} // log

class PesquisaSequencial{

   public static long now() {
      return new Date().getTime();
   }

   public static boolean isEquals ( String str1, String str2) {
   
      if ( str1.length() != str2.length() )
         return false;
   
      int i = 0;
   
      boolean charIgual = str1.charAt( i ) == str2.charAt( i );
   
      while ( ++i < str1.length() && charIgual )
      
         charIgual = str1.charAt( i ) == str2.charAt( i );
   
      return charIgual;
   }//fim isEquals()


   public static void main(String [ ] args)throws Exception{
   
      long inicio = now();
   
      Municipio muni = new Municipio();
   
      ListaSequencial lista = new ListaSequencial();
   
      String linha = "";
      linha = MyIO.readLine();
   
     //entrada e saida 
   
      while (Integer.parseInt(linha) != 0){
      
         muni.ler(Integer.parseInt(linha)); //le os municipios
      
         lista.inserirFim(muni); //cria lista
      
         linha = MyIO.readLine();
      
      }  
      
      
      String linha2;
      linha2 = MyIO.readLine();
      
      while(isEquals(linha2, "FIM") == false ){
      
         if(lista.pesquisar(Integer.parseInt(linha2))){
         
            System.out.println("SIM");
         }
         else{
         
            System.out.println("NÃO");
         }
         linha2 = MyIO.readLine();
      }
      
      long fim = now();
      
      Log log = new Log();
      
      log.createFile(lista.getComp(),fim,inicio);
      
   //lista.motrar();
   }
} 
