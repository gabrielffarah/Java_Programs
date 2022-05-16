/*Gabriel Farah 512981
 * ab 
*/

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

class No {
   public Municipio muni; // Conteudo do no.
   public No esq, dir;  // Filhos da esq e dir.

   /**
    * Construtor da classe.
    * @param elemento Conteudo do no.
    */
   public No(Municipio muni) {
      this(muni, null, null);
   }

   /**
    * Construtor da classe.
    * @param elemento Conteudo do no.
    * @param esq No da esquerda.
    * @param dir No da direita.
    */
   public No(Municipio muni, No esq, No dir) {
      this.muni = muni.clone();
      this.esq = esq;
      this.dir = dir;
   }
}

class ArvoreBinaria {
   private No raiz; // Raiz da arvore.

   /**
    * Construtor da classe.
    */
   public ArvoreBinaria() {
      raiz = null;
   }

   /**
    * Metodo publico iterativo para pesquisar elemento.
    * @param x Elemento que sera procurado.
    * @return <code>true</code> se o elemento existir,
    * <code>false</code> em caso contrario.
    */
   public boolean pesquisar(Municipio muni) {
      return pesquisar(muni, raiz);
   }
   
   private boolean pesquisar(Municipio muni, No i) {
      boolean resp;
      if (i == null) {
         resp = false;
      
      } 
      else if (muni.getId() == i.muni.getId()) {        
         resp = true;
      
      } 
      else if (muni.getId() < i.muni.getId()) {
         resp = pesquisar(muni, i.esq);
      
      } 
      else {
         resp = pesquisar(muni, i.dir);
      }
      return resp;
   }
    

   
   //metodo para pesquisar e mostrar 
   
   public boolean pesquisarMostrar(int x) {

      System.out.printf("raiz ");
      return pesquisarMostrar(x, raiz);
   }
   
   private boolean pesquisarMostrar(int x, No i) {
      boolean resp;
      if (i == null) {
         resp = false;
         System.out.println("NAO");
      
      } 
      else if (x == i.muni.getId()) {
         resp = true;
         System.out.println("SIM");
      
      } 
      else if (x < i.muni.getId()) {
         
         System.out.printf("esq ");
         resp = pesquisarMostrar(x, i.esq);
      
      } 
      else {
         System.out.printf("dir ");
         resp = pesquisarMostrar(x, i.dir);
         
      }
      return resp;
   }

  
   

   /**
    * Metodo publico iterativo para exibir elementos.
    */
   public void mostrarCentral() {
      System.out.print("[ ");
      mostrarCentral(raiz);
      System.out.println("]");
   }

   /**
    * Metodo privado recursivo para exibir elementos.
    * @param i No em analise.
    */
   private void mostrarCentral(No i) {
      if (i != null) {
         mostrarCentral(i.esq); // Elementos da esquerda.
         i.muni.imprimir(); // Conteudo do no.
         mostrarCentral(i.dir); // Elementos da direita.
      }
   }

   /**
    * Metodo publico iterativo para exibir elementos.
    */
   public void mostrarPre() {
      System.out.print("[ ");
      mostrarPre(raiz);
      System.out.println("]");
   }

   /**
    * Metodo privado recursivo para exibir elementos.
    * @param i No em analise.
    */
   private void mostrarPre(No i) {
      if (i != null) {
         i.muni.imprimir(); // Conteudo do no.
         mostrarPre(i.esq); // Elementos da esquerda.
         mostrarPre(i.dir); // Elementos da direita.
      }
   }

   /**
    * Metodo publico iterativo para exibir elementos.
    */
   public void mostrarPos() {
      System.out.print("[ ");
      mostrarPos(raiz);
      System.out.println("]");
   }

   /**
    * Metodo privado recursivo para exibir elementos.
    * @param i No em analise.
    */
   private void mostrarPos(No i) {
      if (i != null) {
         mostrarPos(i.esq); // Elementos da esquerda.
         mostrarPos(i.dir); // Elementos da direita.
         i.muni.imprimir(); // Conteudo do no.
      }
   }


   /**
    * Metodo publico iterativo para inserir elemento.
    * @param x Elemento a ser inserido.
    * @throws Exception Se o elemento existir.
    */
   public void inserir(Municipio muni) throws Exception {
      raiz = inserir(muni,raiz);
   }

   /**
    * Metodo privado recursivo para inserir elemento.    
    * @throws Exception Se o elemento existir.
    */
   private No inserir(Municipio municipio, No i) throws Exception {
      if (i == null) {
         i = new No(municipio);
      
      } 
      else if (municipio.getId() < i.muni.getId()) {
         i.esq = inserir(municipio, i.esq);
      
      } 
      else if (municipio.getId()> i.muni.getId()) {
         i.dir = inserir(municipio, i.dir);
      
      } 
      else {
         throw new Exception("Erro ao inserir!");
      }
   
      return i;
   }


   /**
    * Metodo publico iterativo para remover elemento.
    * @param x Elemento a ser removido.
    * @throws Exception Se nao encontrar elemento.
    */
   public void remover(Municipio muni) throws Exception {
      raiz = remover(muni, raiz);
   }

   /**
    * Metodo privado recursivo para remover elemento.
    * @param x Elemento a ser removido.
    * @param i No em analise.
    * @return No em analise, alterado ou nao.
    * @throws Exception Se nao encontrar elemento.
    */
   private No remover(Municipio municipio, No i) throws Exception {
   
      if (i == null) {
         throw new Exception("Erro ao remover!");
      
      } 
      else if (municipio.getId() < i.muni.getId()) {
         i.esq = remover(municipio, i.esq);
      
      } 
      else if (municipio.getId() > i.muni.getId()) {
         i.dir = remover(municipio, i.dir);
      
      // Sem no a direita.
      } 
      else if (i.dir == null) {
         i = i.esq;
      
      // Sem no a esquerda.
      } 
      else if (i.esq == null) {
         i = i.dir;
      
      // No a esquerda e no a direita.
      } 
      else {
         i.esq = antecessor(i, i.esq);
      }
   
      return i;
   }
   
   
   public void idremover(int id) throws Exception {
      raiz = idremover(id, raiz);
   }
   
   
   private No idremover(int id, No i) throws Exception {
    if (pesquisarExis(id) == true) {
      if (i == null) {
         throw new Exception("Erro ao remover!");
      
      } 
      else if (id < i.muni.getId()) {
         i.esq = idremover(id, i.esq);
      
      } 
      else if (id > i.muni.getId()) {
         i.dir = idremover(id, i.dir);
      
      // Sem no a direita.
      } 
      else if (i.dir == null) {
         i = i.esq;
      
      // Sem no a esquerda.
      } 
      else if (i.esq == null) {
         i = i.dir;
      
      // No a esquerda e no a direita.
      } 
      else {
         i.esq = antecessor(i, i.esq);
      }
     }
      return i;
   }

   

   /**
    * Metodo para trocar no removido pelo antecessor.
    * @param i No que teve o elemento removido.
    * @param j No da subarvore esquerda.
    * @return No em analise, alterado ou nao.
    */
   private No antecessor(No i, No j) {
   
      // Existe no a direita.
      if (j.dir != null) {
         // Caminha para direita.
         j.dir = antecessor(i, j.dir);
      
      // Encontrou o maximo da subarvore esquerda.
      } 
      else {
         swap(i,j);
         //i.muni.getId() = j.muni.getId(); // Substitui i por j.
         j = j.esq; // Substitui j por j.ESQ.
      }
      return j;
   }

   public void swap(No i,No j){
   
      Municipio temp = i.muni;
   
      i.muni = j.muni.clone();
      j.muni = temp.clone();
   
   
   }

   public boolean pesquisarExis(int x) {
    return pesquisarExis(x, raiz);
  }

  
  private boolean pesquisarExis(int x, No i) {
    boolean resp;
    if (i == null) {      
      resp = false;

    } else if (x == i.muni.getId()) {
      
      resp = true;

    } else if (x < i.muni.getId()) {
      
      resp = pesquisarExis(x, i.esq);

    } else {
      resp = pesquisarExis(x, i.dir);
    }
    return resp;
  }
}



public class Arvore_Binaria{

public static boolean isEquals ( String str1, String str2) {

    if ( str1.length() != str2.length() )
      return false;

    int i = 0;

    boolean charIgual = str1.charAt( i ) == str2.charAt( i );

    while ( ++i < str1.length() && charIgual )
      charIgual = str1.charAt( i ) == str2.charAt( i );

    return charIgual;
  }//fim isEquals()



   public static void main(String [ ]args)throws Exception{
   
      Municipio muni = new Municipio();
   
      ArvoreBinaria arvore = new ArvoreBinaria ();   
   
      String linha ;
      linha = MyIO.readLine();      
   
   //entrada e saida 
   
      while (Integer.parseInt(linha) != 0){
      
         muni.ler(Integer.parseInt(linha)); //le os municipios
         boolean existe = arvore.pesquisar(muni);
         
         if(existe == false){ // vê se ja tem algum 
         
            arvore.inserir(muni); //cria arvore
         
         }
      
         linha = MyIO.readLine();// lê a linha
      
      }
   
   
      String linha2;
   
      int x = Integer.parseInt(MyIO.readLine());
   
      for(int i = 0;i < x; i++){
      
         linha2 = MyIO.readLine();

         String arrayAux[] = linha2.split(" ");
      
      //teste para metodos de inserçao e remorçao
      
         if (linha2.charAt(0) == 'I') {    
         
            if(arvore.pesquisar(muni) == false){  
            
               muni.ler(Integer.parseInt(arrayAux[1]));
               arvore.inserir(muni);
            }
         }
         else if(linha2.charAt(0)=='R') {
         
            arvore.idremover(Integer.parseInt(arrayAux[1]));
            //MyIO.println("(R) "+ muni.getNome());
         
         }
      
      }// end for
      
      String linha3 = MyIO.readLine();
      boolean existe;
      
      while(!isEquals(linha3, "FIM")){
      
         arvore.pesquisarMostrar(Integer.parseInt(linha3));
         linha3 = MyIO.readLine();
       
      }
   
   }
}