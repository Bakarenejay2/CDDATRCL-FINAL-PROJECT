import java.util.*;
public class Graph {
    
    class Edge {
           String src, dest, landmark;
       }

       int vertices, edges;

      
       Edge[] edge;

       Graph(int vertices, int edges) {
           this.vertices = vertices;
           this.edges = edges;

           
           edge = new Edge[edges];
           for (int i = 0; i < edges; i++) {

            
               edge[i] = new Edge();
           }
       }

       public static void main(String[] args) {

           // create an object of Graph class
           int noVertices = 19;
           int noEdges = 19;
           Graph myGraph = new Graph(noVertices, noEdges);
           System.out.println("Select a station: ");
           Scanner sc= new Scanner(System.in);
           String location=sc.nextLine();
           

           
         
           myGraph.edge[0].src = "Baclaran";
           myGraph.edge[0].dest = "EDSA";
           myGraph.edge[0].landmark="Redemptorist Church";

           myGraph.edge[1].src = "EDSA";
           myGraph.edge[1].dest = "Gil puyat";
           myGraph.edge[1].landmark="Metropoint Mall";

           myGraph.edge[2].src = "Gil puyat";
           myGraph.edge[2].dest = "Vito cruz";
           myGraph.edge[2].landmark="Chowking";
           
           myGraph.edge[3].src = "Vito Cruz";
           myGraph.edge[3].dest = "Quirino";
           myGraph.edge[3].landmark="De La Salle-College of Saint Benilde Manila";
           
           myGraph.edge[4].src = "Quirino";
           myGraph.edge[4].dest = "Pedro Gil";
           myGraph.edge[4].landmark="PNB - Malate Branch";
           
           myGraph.edge[5].src = "Pedro Gil";
           myGraph.edge[5].dest = "UN avenue";
           myGraph.edge[5].landmark="UP College of Dentistry";
           
           myGraph.edge[6].src = "UN Avenue";
           myGraph.edge[6].dest = "Central";
           myGraph.edge[6].landmark="Times Plaza";
           
           myGraph.edge[7].src = "Central";
           myGraph.edge[7].dest = "Carriedo";
           myGraph.edge[7].landmark="SM City Manila";
           
           myGraph.edge[8].src = "Carriedo";
           myGraph.edge[8].dest = "D. Jose";
           myGraph.edge[8].landmark="SM Clearance Outlet";
           
           myGraph.edge[9].src = "D.Jose";
           myGraph.edge[9].dest = "Bambang";
           myGraph.edge[9].landmark="Puregold-Doroteo Jose";
           
           myGraph.edge[10].src = "Bambang";
           myGraph.edge[10].dest = "Tayuman";
           myGraph.edge[10].landmark="BDO Rizal Avenue";
           
           myGraph.edge[11].src = "Tayuman";
           myGraph.edge[11].dest = "Blumentrit";
           myGraph.edge[11].landmark="Dechmark Hotel";
           
           myGraph.edge[12].src = "Blumentrit";
           myGraph.edge[12].dest = "Abad santos";
           myGraph.edge[12].landmark="Blumentritt Market";

           myGraph.edge[13].src = "Abad santos";
           myGraph.edge[13].dest = "R. papa";
           myGraph.edge[13].landmark="manila north cementery";
           
           myGraph.edge[14].src = "R.papa";
           myGraph.edge[14].dest = "5th avenue";
           myGraph.edge[14].landmark="Hotel Sogo Lrt Monumento Stn";
           
           myGraph.edge[15].src = "5th avenue";
           myGraph.edge[15].dest = "Monumento";
           myGraph.edge[15].landmark="Northern Rizal Yorklin School";
           
           myGraph.edge[16].src = "Monumento";
           myGraph.edge[16].dest = "Balintawak";
           myGraph.edge[16].landmark="First North Luzon Transit";
           
           myGraph.edge[17].src = "Balintawak";
           myGraph.edge[17].dest = "Roosevelt";
           myGraph.edge[17].landmark="Balintawak Family Public Market";
           
           myGraph.edge[18].src = "Roosevelt";
           myGraph.edge[18].dest = "end of LRT line 1";
           myGraph.edge[18].landmark="Muñoz Plaza";
         
           if(location.equals(myGraph.edge[0].src = "Baclaran")) 
           {
                 System.out.println("Redemptorist Church");
           }
           else if(location.equals(myGraph.edge[1].src = "EDSA") )
           {
                 System.out.println("Metropoint Mall");
           } 
           else if(location.equals("Gil puyat") )
           {
                 System.out.println("Chowking");
           } 
           else if(location.equals("Vito Cruz") )
           {
                 System.out.println("De La Salle-College of Saint Benilde Manila");
           } 
           else if(location.equals( myGraph.edge[4].src = "Quirino") )
           {
                 System.out.println( myGraph.edge[4].landmark="PNB - Malate Branch");
           } 
           else if(location.equals(myGraph.edge[5].src = "Pedro Gil") )
           {
                 System.out.println(myGraph.edge[5].landmark="UP College of Dentistry");
           } 
           else if(location.equals( myGraph.edge[6].src = "UN Avenue") )
           {
                 System.out.println(myGraph.edge[6].landmark="Times Plaza");
           } 
           else if(location.equals( myGraph.edge[7].src = "Central") )
           {
                 System.out.println( myGraph.edge[7].landmark="SM City Manila");
           } 
           else if(location.equals(myGraph.edge[8].src = "Carriedo") )
           {
                 System.out.println( myGraph.edge[8].landmark="SM Clearance Outlet");
           } 
           else if(location.equals( myGraph.edge[9].src = "D.Jose") )
           {
                 System.out.println(myGraph.edge[9].landmark="Puregold-Doroteo Jose");
           } 
           else if(location.equals(  myGraph.edge[10].src = "Bambang") )
           {
                 System.out.println(myGraph.edge[10].landmark="BDO Rizal Avenue");
           } 
           else if(location.equals(myGraph.edge[11].src = "Tayuman") )
           {
                 System.out.println(myGraph.edge[11].landmark="Dechmark Hotel");
           } 
           else if(location.equals( myGraph.edge[12].src = "Blumentrit"))
           {
                 System.out.println(myGraph.edge[12].landmark="Blumentritt Market");
           } 
           else if(location.equals(myGraph.edge[13].src = "Abad santos") )
           {
                 System.out.println(myGraph.edge[13].landmark="manila north cementery");
           } 
           else if(location.equals( myGraph.edge[14].src = "R.papa") )
           {
                 System.out.println(myGraph.edge[14].landmark="Hotel Sogo Lrt Monumento Stn");
           } 
           else if(location.equals(myGraph.edge[15].src = "5th avenue") )
           {
                 System.out.println(myGraph.edge[15].landmark="Northern Rizal Yorklin School");
           } 
           else if(location.equals( myGraph.edge[16].src = "Monumento") )
           {
                 System.out.println( myGraph.edge[16].landmark="First North Luzon Transit");
           } 
           else if(location.equals(myGraph.edge[17].src = "Balintawak") )
           {
                 System.out.println(myGraph.edge[17].landmark="Balintawak Family Public Market");
           } 

           else if(location.equals(myGraph.edge[18].src = "Roosevelt") )
           {
                 System.out.println( myGraph.edge[18].landmark="Muñoz Plaza");
           } 

           for (int i = 0; i < noEdges; i++) {
               System.out.println(myGraph.edge[i].landmark + " - "+myGraph.edge[i].src+" -> " + myGraph.edge[i].dest);
           }
sc.close();
 
       }
    }
