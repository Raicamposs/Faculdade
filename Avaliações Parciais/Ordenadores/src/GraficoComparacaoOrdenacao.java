
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoComparacaoOrdenacao extends JFrame {

   private static final long serialVersionUID = 1L;
  
  

   public GraficoComparacaoOrdenacao(String applicationTitle, String chartTitle,double[][] matriz) {
        super(applicationTitle);

        JFreeChart pieChart = ChartFactory.createBarChart(chartTitle, "Ordenação", "Tempo de Execução", createDataset(matriz),PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(700, 470));
        setContentPane(chartPanel);
    }

   
  
   private CategoryDataset createDataset(double[][] matriz) {
     
    
      final String Bolha = "Bolha";
      final String Insercao = "Inserção";
      final String Selecao = "Seleção";

    
      final String Dados1= "Dados1";
      final String Dados2 = "Dados2";
      final String Dados3 = "Dados3";
    

       final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

       dataset.addValue(matriz[0][0], Bolha, Dados1);
       dataset.addValue(matriz[0][1], Bolha, Dados2);
       dataset.addValue(matriz[0][2], Bolha, Dados3);

       dataset.addValue(matriz[1][0], Insercao, Dados1);
       dataset.addValue(matriz[1][1], Insercao, Dados2);
       dataset.addValue(matriz[1][2], Insercao, Dados3);

       dataset.addValue(matriz[2][0], Selecao, Dados1);
       dataset.addValue(matriz[2][1], Selecao, Dados2);
       dataset.addValue(matriz[2][2], Selecao, Dados3);

       return dataset;
     
  }

       
   }

 

