/*
Gabriel Farah
512981
*/

import java.io.*;
import java.util.*;

class Serie{

   private String nome;
   private String formato;
   private String duracao;
   private String paisOrigem;
   private String idioma;
   private String emissora;
   private String transmissao;
   private int temporadas;
   private int episodios;

   public Serie(){
   
      this.nome = "";
      this.formato = "";
      this.duracao = "";
      this.paisOrigem = "";
      this.idioma = "";
      this.emissora = "";
      this.transmissao = "";
      this.temporadas = 0;
      this.episodios = 0;
   
   }

   public Serie(String nome,String formato,String duracao,String paisOrigem,String idioma,String emissora,String transmissao,int temporadas,int episodios ){
   
      this.nome = nome;
      this.formato = formato;
      this.duracao = duracao;
      this.paisOrigem = paisOrigem;
      this.idioma = idioma;
      this.emissora = emissora;
      this.transmissao = transmissao;
      this.temporadas = temporadas;
      this.episodios = episodios;
   
   }

   public String getNome(){
      return this.nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }

   public String getFormato(){
      return this.formato;
   }
   public void setFormato(String formato){
      this.formato = formato;
   }

   public String getDuracao(){
      return this.duracao;
   }
   public void setDuracao(String duracao){
      this.duracao = duracao;
   }

   public String getPaisOrigem(){
      return this.paisOrigem;
   }
   public void setPaisOrigem(String paisOrigem){
      this.paisOrigem = paisOrigem;
   }

   public String getIdioma(){
      return this.idioma;
   }
   public void setIdioma(String idioma){
      this.idioma = idioma;
   }

   public String getEmissora(){
      return this.emissora;
   }
   public void setEmissora(String emissora){
      this.emissora = emissora;
   }

   public String getTransmissao(){
      return this.transmissao;
   }
   public void setTransmissao(String transmissao){
      this.transmissao = transmissao;
   }

   public int getTemporadas(){
      return this.temporadas;
   }
   public void setTemporadas(int temporadas){
      this.temporadas = temporadas;
   }

   public int getEpisodios(){
      return this.episodios;
   }
   public void setEpisodios(int episodios){
      this.episodios = episodios;
   }

   public Serie clone(){
   
      Serie serie = new Serie();
   
      serie.nome = this. nome;
      serie.formato = this.formato;
      serie.duracao = this.duracao;
      serie.paisOrigem = this.paisOrigem;
      serie.idioma = this.idioma;
      serie.emissora = this.emissora;
      serie.transmissao = this.transmissao;
      serie.temporadas = this.temporadas;
      serie.episodios = this.episodios;
   
      return serie;
   }

   public void imprimir() {
      System.out.println(nome + ' ' + formato + ' ' +  duracao + ' ' +
             paisOrigem + ' ' + idioma + ' ' + emissora + ' ' +
             transmissao + ' ' +  temporadas + ' ' + episodios);
   }



   public void ler(String nomeArquivo){
      try{
         String linha;
         BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/"+nomeArquivo), "UTF8"));
      
         for(linha = br.readLine(); linha.contains("<h1") == false; linha = br.readLine());
         String nome = getSubstringEntre(linha, "lang=\"pt\"><i>", "</i>");
         this.setNome(nome);
      
         for(linha = br.readLine(); linha.contains("Formato") == false; linha = br.readLine());
         String formato = removeTags(br.readLine());
         this.setFormato(formato);
      
         for(linha = br.readLine(); linha.contains("Dura") == false; linha = br.readLine());
         String dur = removeTags(br.readLine());
         this.setDuracao(dur);
      
         for(linha = br.readLine(); linha.contains("de origem") == false; linha = br.readLine());
         String pais = removeTags(br.readLine());
         this.setPaisOrigem(pais);
      
         for(linha = br.readLine(); linha.contains("Idioma") == false; linha = br.readLine());
         String idioma = removeTags(br.readLine());
         this.setIdioma(idioma);
      
         for(linha = br.readLine(); linha.contains("Emissora") == false; linha = br.readLine());
         String emissora = removeTags(br.readLine());
         this.setEmissora(emissora);
      
         for(linha = br.readLine(); linha.contains("Transmiss") == false; linha = br.readLine());
         String transmissao = removeTags(br.readLine());
         this.setTransmissao(transmissao);
      
         for(linha = br.readLine(); linha.contains("de temporadas") == false; linha = br.readLine());
         String temporadas = removeTags(br.readLine());
         int aux = soInt(temporadas);
         this.setTemporadas(aux);
      
         for(linha = br.readLine(); linha.contains("de epis") == false; linha = br.readLine());
         String episodios = removeTags(br.readLine());
         aux = soInt(episodios);
         this.setEpisodios(aux);
      
      
      
         Arq.close();
      }
      catch(IOException e){
      
      }
   }
   public static int indexOf(String str, char c){
      int resp = -1;
      
      for(int i = 0; i < str.length(); i++){
         if(c == str.charAt(i)){
            resp = 1;
         }
      }
      return resp;
   }

   public static int soInt(String str){
      int resp = 0;
      String numero = "";
      String inter = "0123456789";
      for(int i = 0; i < str.length(); i++){
         if(indexOf(inter, str.charAt(i)) == -1){
            i = str.length();  
         } 
         else {
            numero += str.charAt(i);
         }
      }
      
      resp = Integer.parseInt(numero);
      
      return resp;
   }


   public String removeTags( String str )
   {
    // definir dados
      String result = "";
   
    // anda na string toda
      for( int i = 0; i < str.length( ); i++ )
      {
      // olha a primeira tag
         while( i < str.length( ) && str.charAt( i ) == '<' )
         {
         // despreza a tag
            for( i++; str.charAt( i ) != '>'; i++ );
            i++;
         
            while( i < str.length( ) && str.charAt( i ) == '&' )
            {
               for( i++; str.charAt( i ) != ';'; i++ );
               i++;
            }// end while
         }// end while
      
         while( i < str.length( ) && str.charAt( i ) == '&' )
         {
            for( i++; str.charAt( i ) != ';'; i++ );
            i++;
            result += ' ';
         }// end while
      
         if( i < str.length( ))
         {
            result += str.charAt( i );
         }// end if
      }// end for
   
      while( result.length( ) > 0 && result.charAt( 0 ) == ' ' )
      {
         result = result.substring( 1 );
      }// end while
   
      return( result );
   }// end removeTags( )

   public String getSubstringEntre( String str, String antes, String depois )
   {
    // definir dados
      String result = "";
      int posInicio, posFim;
   
    // pegando a posicao do inicio
      posInicio = str.indexOf( antes ) + antes.length( );
   
    // testa se o antes eh diferente do depois
      if( antes.compareTo( depois ) != 0 )
      {
         posFim = str.indexOf( depois );
      }
      else
      {
         posFim = str.indexOf( depois, posInicio );
      }// end if
   
    // pegando a substring
      if( 0 <= posInicio && posInicio < posFim && posFim < str.length( ))
      {
         result = str.substring( posInicio, posFim );
      }// end if
   
      return( result );
   }// end getSubstringEntre( )

  /**
   * Metodo getIntEntre( )
   * @param  String s      - string analisada.
     * @param  String antes  - o que tem antes.
     * @param  String depois - o que tem depois.
     * @return retorna um valor inteiro.
   */
   public int getIntEntre( String s, String antes, String depois )
   {
      return( new Integer( getSubstringEntre( s, antes, depois ).replace( ".", "" ).trim( ))).intValue( );
   }// end getIntEntre( )
}

class No {
   public Serie serie; // Conteudo do no.
   public No esq, dir;  // Filhos da esq e dir.

   /**
    * Construtor da classe.
    * @param elemento Conteudo do no.
    */
   public No(Serie serie) {
      this(serie, null, null);
   }

   /**
    * Construtor da classe.
    * @param elemento Conteudo do no.
    * @param esq No da esquerda.
    * @param dir No da direita.
    */
   public No(Serie serie, No esq, No dir) {
      this.serie = serie.clone();
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
   public boolean pesquisar(Serie s) {
      return pesquisar(s, raiz);
   }
   
   private boolean pesquisar(Serie s, No i) {
      boolean resp;
      if (i == null) {
         resp = false;
      
      } 
      else if (s.getNome().equals(i.serie.getNome())) {        
         resp = true;
      
      } 
      else if (s.getNome().compareTo(i.serie.getNome()) < 0) {
         resp = pesquisar(s, i.esq);
      
      } 
      else {
         resp = pesquisar(s, i.dir);
      }
      return resp;
   }
    

   
   //metodo para pesquisar e mostrar 
   
   public boolean pesquisarMostrar(String x) {
   
      System.out.printf("raiz ");
      return pesquisarMostrar(x, raiz);
   }
   
   private boolean pesquisarMostrar(String x, No i) {
      boolean resp;
      if (i == null) {
         resp = false;
         System.out.println("NAO");
      
      } 
      else if (x.equals(i.serie.getNome())) {
         resp = true;
         System.out.println("SIM");
      
      } 
      else if (x.compareTo(i.serie.getNome()) < 0) {
         
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
         i.serie.imprimir(); // Conteudo do no.
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
         i.serie.imprimir(); // Conteudo do no.
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
         i.serie.imprimir(); // Conteudo do no.
      }
   }


   /**
    * Metodo publico iterativo para inserir elemento.
    * @param x Elemento a ser inserido.
    * @throws Exception Se o elemento existir.
    */
   public void inserir(Serie s) throws Exception {
      raiz = inserir(s,raiz);
   }

   /**
    * Metodo privado recursivo para inserir elemento.    
    * @throws Exception Se o elemento existir.
    */
   private No inserir(Serie s, No i) throws Exception {
      if (i == null) {
         i = new No(s);
      
      } 
      else if (s.getNome().compareTo(i.serie.getNome()) < 0) {
         i.esq = inserir(s, i.esq);
      
      } 
      else if (s.getNome().compareTo(i.serie.getNome()) > 0) {
         i.dir = inserir(s, i.dir);
      
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
   public void remover(Serie s) throws Exception {
      raiz = remover(s, raiz);
   }

   /**
    * Metodo privado recursivo para remover elemento.
    * @param x Elemento a ser removido.
    * @param i No em analise.
    * @return No em analise, alterado ou nao.
    * @throws Exception Se nao encontrar elemento.
    */
   private No remover(Serie s, No i) throws Exception {
   
      if (i == null) {
         throw new Exception("Erro ao remover!");
      
      } 
      else if (s.getNome().compareTo(i.serie.getNome()) < 0) {
         i.esq = remover(s, i.esq);
      
      } 
      else if (s.getNome().compareTo(i.serie.getNome()) > 0) {
         i.dir = remover(s, i.dir);
      
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
   
   
   public void idremover(String x) throws Exception {
      raiz = idremover(x, raiz);
   }
   
   
   private No idremover(String x, No i) throws Exception {
      if (pesquisarExist(x) == true) {
         if (i == null) {
            throw new Exception("Erro ao remover!");
         
         } 
         else if (x.compareTo(i.serie.getNome()) < 0) {
            i.esq = idremover(x, i.esq);
         
         } 
         else if (x.compareTo(i.serie.getNome()) < 0) {
            i.dir = idremover(x, i.dir);
         
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
   
      Serie temp = i.serie;
   
      i.serie = j.serie.clone();
      j.serie = temp.clone();
   
   
   }

   public boolean pesquisarExist(String x) {
      return pesquisarExist(x, raiz);
   }

  
   private boolean pesquisarExist(String x, No i) {
      boolean resp;
      if (i == null) {      
         resp = false;
      
      } 
      else if (x.equals(i.serie.getNome())) {
      
         resp = true;
      
      } 
      else if (x.compareTo(i.serie.getNome()) < 0) {
      
         resp = pesquisarExist(x, i.esq);
      
      } 
      else {
         resp = pesquisarExist(x, i.dir);
      }
      return resp;
   }
}



public class AB{

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
   
      Serie serie = new Serie();
   
      ArvoreBinaria arvore = new ArvoreBinaria ();   
   
      String linha ;
      linha = MyIO.readLine();      
   
   //entrada e saida 
   
      while ((!isEquals(linha,"FIM"))){
      
         serie.ler(linha); //le as series
         boolean existe = arvore.pesquisar(serie);
         
         if(existe == false){ // vê se ja tem algum 
         
            arvore.inserir(serie); //cria arvore
         
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
         
            if(arvore.pesquisar(serie) == false){  
            
               serie.ler((arrayAux[1]));
               arvore.inserir(serie);
            }
         }
         else if(linha2.charAt(0)=='R') {
         
            arvore.idremover((arrayAux[1]));
            //MyIO.println("(R) "+ muni.getNome());
         
         }
      
      }// end for
      
      String linha3 = MyIO.readLine();
      boolean existe;
      
      while(!isEquals(linha3, "FIM")){
      
         arvore.pesquisarMostrar((linha3));
         linha3 = MyIO.readLine();
       
      }
   
   }
}
