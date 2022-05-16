/*Gabriel Farah 512981
 * alvinegra
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
class No{
   public boolean cor;
   public Municipio muni;
   public No esq, dir;
  
   public No (){
      this(null);
   }
   public No (Municipio muni){
      this(muni, false, null, null);
   }
   public No (Municipio muni, boolean cor){
      this(muni, cor, null, null);
   }
   public No (Municipio muni, boolean cor, No esq, No dir){
      this.cor = cor;
      this.muni = muni.clone();
      this.esq = esq;
      this.dir = dir;
   }
}

class Alvinegra {
   private No raiz; // Raiz da arvore.

  /**
   * Construtor da classe.
   */
   public Alvinegra() {
   
      raiz = null;
   }
   
   
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
   * Metodo publico iterativo para pesquisar elemento.
   * @param elemento Elemento que sera procurado.
   * @return <code>true</code> se o elemento existir,
   * <code>false</code> em caso contrario.
   */
   public boolean pesquisar(Municipio muni) {
      return pesquisar(muni, raiz);
   }

  /**
   * Metodo privado recursivo para pesquisar elemento.
   * @param elemento Elemento que sera procurado.
   * @param i No em analise.
   * @return <code>true</code> se o elemento existir,
   * <code>false</code> em caso contrario.
   */
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
         i.muni.imprimir();
         //System.out.print(((i.cor) ? "(p) " : "(b) ")); // Conteudo do no.
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
         i.muni.imprimir();
         //System.out.print(((i.cor) ? "(p) " : "(b) ")); // Conteudo do no.
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
         i.muni.imprimir();
         //System.out.print(((i.cor) ? "(p) " : "(b) ")); // Conteudo do no.
      }
   }

  /**
   * Metodo publico iterativo para inserir elemento.
   * @param elemento Elemento a ser inserido.
   * @throws Exception Se o elemento existir.
   */
   public void inserir(Municipio muni) throws Exception {
      
   
      //Se a arvore estiver vazia
      if(raiz == null){
         raiz = new No(muni, false);
         //System.out.println("Antes, zero elementos. Agora, raiz(" + raiz.elemento + ").");
      
      //Senao, se a arvore tiver um elemento 
      } 
      else if (raiz.esq == null && raiz.dir == null){
         if (raiz.muni.getId() > muni.getId()){
         
            raiz.esq = new No(muni, true);
            //System.out.println("Antes, um elemento. Agora, raiz(" + raiz.elemento + ") e esq(" + raiz.esq.elemento +").");
         } 
         else {
            raiz.dir = new No(muni, true);
           // System.out.println("Antes, um elemento. Agora, raiz(" + raiz.elemento + ") e dir(" + raiz.dir.elemento +").");
         }
      
      //Senao, se a arvore tiver dois elementos (raiz e dir)
      } 
      else if (raiz.esq == null){
      
         if(raiz.muni.getId() > muni.getId()){
            raiz.esq = new No(muni.clone());
            //System.out.println("Antes, dois elementos(A). Agora, raiz(" + raiz.elemento + "), esq (" + raiz.esq.elemento +") e dir(" + raiz.dir.elemento +").");
         
         } 
         else if (raiz.dir.muni.getId() > muni.getId()){
            raiz.esq = new No(raiz.muni.clone());
            raiz.muni = muni.clone();
            //System.out.println("Antes, dois elementos(B). Agora, raiz(" + raiz.elemento + "), esq (" + raiz.esq.elemento +") e dir(" + raiz.dir.elemento +").");
         
         } 
         else {
            raiz.esq = new No(raiz.muni.clone());
            raiz.muni = raiz.dir.muni.clone();
            raiz.dir.muni = muni.clone();
            //System.out.println("Antes, dois elementos(C). Agora, raiz(" + raiz.elemento + "), esq (" + raiz.esq.elemento +") e dir(" + raiz.dir.elemento +").");
         }
      
         raiz.esq.cor = raiz.dir.cor = false;
         
      //Senao, se a arvore tiver dois elementos (raiz e esq)
      } 
      else if (raiz.dir == null){
         
         if(raiz.muni.getId() < muni.getId()){
            raiz.dir = new No(muni.clone());
            //System.out.println("Antes, dois elementos(D). Agora, raiz(" + raiz.elemento + "), esq (" + raiz.esq.elemento +") e dir(" + raiz.dir.elemento +").");
         } 
         else if (raiz.esq.muni.getId() < muni.getId()){
            raiz.dir = new No(raiz.muni.clone());
            raiz.muni = muni.clone();
            //System.out.println("Antes, dois elementos(E). Agora, raiz(" + raiz.elemento + "), esq (" + raiz.esq.elemento +") e dir(" + raiz.dir.elemento +").");
         } 
         else {
            raiz.dir = new No(raiz.muni);
            raiz.muni = raiz.esq.muni.clone();
            raiz.esq.muni = muni.clone();
           // System.out.println("Antes, dois elementos(F). Agora, raiz(" + raiz.elemento + "), esq (" + raiz.esq.elemento +") e dir(" + raiz.dir.elemento +").");
         }
      
         raiz.esq.cor = raiz.dir.cor = false;
      
      //Senao, a arvore tem tres ou mais elementos
      } 
      else {
         //System.out.println("Arvore com tres ou mais elementos...");
         inserir(muni, null, null, null, raiz);
      }
   
      raiz.cor = false;
   }

   private void balancear(No bisavo, No avo, No pai, No i){
   
      //Se o pai tambem e preto, reequilibrar a arvore, rotacionando o avo
      if(pai.cor == true){
      
         //4 tipos de reequilibrios e acoplamento
         if(pai.muni.getId() > avo.muni.getId()){ // rotacao a esquerda ou direita-esquerda
            if(i.muni.getId() > pai.muni.getId()){
               avo = rotacaoEsq(avo);
            } 
            else {
               avo = rotacaoDirEsq(avo);
            }
         
         } 
         else { // rotacao a direita ou esquerda-direita
            if(i.muni.getId() < pai.muni.getId()){
               avo = rotacaoDir(avo);
            } 
            else {
               avo = rotacaoEsqDir(avo);
            }
         }
      
         if (bisavo == null){
            raiz = avo;
         } 
         else {
            if(avo.muni.getId() < bisavo.muni.getId()){
               bisavo.esq = avo;
            } 
            else {
               bisavo.dir = avo;
            }
         }
      
         //reestabelecer as cores apos a rotacao
         avo.cor = false;
         avo.esq.cor = avo.dir.cor = true;
         //System.out.println("Reestabeler cores: avo(" + avo.elemento + "->branco) e avo.esq / avo.dir(" + avo.esq.elemento + "," + avo.dir.elemento + "-> pretos)");
      } //if(pai.cor == true)
   }

  /**
   * Metodo privado recursivo para inserir elemento.
   * @param elemento Elemento a ser inserido.
   * @param avo No em analise.
   * @param pai No em analise.
   * @param i No em analise.
   * @throws Exception Se o elemento existir.
   */
   private void inserir(Municipio muni, No bisavo, No avo, No pai, No i) throws Exception {
      if (i == null) {
      
         if(muni.getId() < pai.muni.getId()){
            i = pai.esq = new No(muni, true);
         } 
         else {
            i = pai.dir = new No(muni, true);
         }
      
         if(pai.cor == true){
            balancear(bisavo, avo, pai, i);
         }
      
      } 
      else {
      
        //Achou um 4-no: eh preciso fragmeta-lo e reequilibrar a arvore
         if(i.esq != null && i.dir != null && i.esq.cor == true && i.dir.cor == true){
            i.cor = true;
            i.esq.cor = i.dir.cor = false;
            if(i == raiz){
               i.cor = false;
            }
            else if(pai.cor == true){
               balancear(bisavo, avo, pai, i);
            }
         }
         if (muni.getId() < i.muni.getId()) {
            inserir(muni, avo, pai, i, i.esq);
         } 
         else if (muni.getId() > i.muni.getId()) {
            inserir(muni, avo, pai, i, i.dir);
         } 
         else {
            throw new Exception("Erro inserir (elemento repetido)!");
         }
      }
   }

   private No rotacaoDir(No no) {
      //System.out.println("Rotacao DIR(" + no.elemento + ")");
      No noEsq = no.esq;
      No noEsqDir = noEsq.dir;
   
      noEsq.dir = no;
      no.esq = noEsqDir;
   
      return noEsq;
   }

   private No rotacaoEsq(No no) {
      //System.out.println("Rotacao ESQ(" + no.elemento + ")");
      No noDir = no.dir;
      No noDirEsq = noDir.esq;
   
      noDir.esq = no;
      no.dir = noDirEsq;
      return noDir;
   }

   private No rotacaoDirEsq(No no) {
      no.dir = rotacaoDir(no.dir);
      return rotacaoEsq(no);
   }

   private No rotacaoEsqDir(No no) {
      no.esq = rotacaoEsq(no.esq);
      return rotacaoDir(no);
   }
}

public class ArvoreAlvinegra13{

   public static boolean isEquals ( String str1, String str2) {
   
      if ( str1.length() != str2.length() )
      
         return false;
   
      int i = 0;
   
      boolean igual = str1.charAt( i ) == str2.charAt( i );
   
      while ( ++i < str1.length() && igual )
      
         igual = str1.charAt( i ) == str2.charAt( i );
   
      return igual;
   
   }//fim isEquals()



   public static void main(String [ ]args)throws Exception{
   
      Municipio muni = new Municipio();
   
      Alvinegra arvore = new Alvinegra ();   
   
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
         
            //arvore.idremover(Integer.parseInt(arrayAux[1]));
            //MyIO.println("Erro "+ muni.getNome());
         
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