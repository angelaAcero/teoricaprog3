package taller.programacion.pkg3.teorica.corte.pkg3.javachart;


import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.general.DefaultPieDataset; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYZDataset;

import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries; 
import org.jfree.data.time.TimeSeriesCollection; 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author amace
 */
public class piechart11 extends javax.swing.JFrame {
DefaultTableModel Tabla1 = new DefaultTableModel();
    /**
     * Creates new form piechart11
     */
    public piechart11() 
    {
        initComponents();
    }
    public void graficopie1()
    {
    
        DefaultPieDataset dataset2 = new DefaultPieDataset();
        
        dataset2.setValue("Taylor Swift", Integer.parseInt((String)Tabla1.getValueAt(0,1)));
        dataset2.setValue("Bad Bunny", Integer.parseInt((String)Tabla1.getValueAt(1,1)));
        dataset2.setValue("The Wekend", Integer.parseInt((String)Tabla1.getValueAt(2,1)));
        dataset2.setValue("Drake", Integer.parseInt((String)Tabla1.getValueAt(3,1)));
        dataset2.setValue("Peso Pluma", Integer.parseInt((String)Tabla1.getValueAt(4,1)));
        dataset2.setValue("Feid", Integer.parseInt((String)Tabla1.getValueAt(5,1)));
        dataset2.setValue("Travis Scott", Integer.parseInt((String)Tabla1.getValueAt(6,1)));
        dataset2.setValue("SZA", Integer.parseInt((String)Tabla1.getValueAt(7,1)));
        dataset2.setValue("Karol G", Integer.parseInt((String)Tabla1.getValueAt(8,1)));
        dataset2.setValue("Lana Del Rey", Integer.parseInt((String)Tabla1.getValueAt(9,1)));
        
    // Generar el gráfico 
        
            
        JFreeChart chart2 = ChartFactory.createPieChart(
        "Top 10 Artistas", // Título
        dataset2, // Dataset
        true, // Mostrar leyenda
        true, // Usar tooltips
        false // Configurar para generar URLs
        );
    // Generar un archivo con el gráfico

        ChartPanel panel2 = new ChartPanel(chart2);
        panel2.setMouseWheelEnabled(true);
        panel2.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel2);
//        
}
    public void graficopie2() /// sobre-100;
    { 
        DefaultPieDataset dataset2 = new DefaultPieDataset();
        
        dataset2.setValue("Botzila", Integer.parseInt((String)Tabla1.getValueAt(0,1)));
        dataset2.setValue("Baymax", Integer.parseInt((String)Tabla1.getValueAt(1,1)));
        dataset2.setValue("WallE", Integer.parseInt((String)Tabla1.getValueAt(2,1)));
        dataset2.setValue("Astroboy", Integer.parseInt((String)Tabla1.getValueAt(3,1)));
        dataset2.setValue("Bender", Integer.parseInt((String)Tabla1.getValueAt(4,1)));
        dataset2.setValue("Atom", Integer.parseInt((String)Tabla1.getValueAt(5,1)));
        
    // Generar el gráfico 
        
        
        JFreeChart chart2 = ChartFactory.createPieChart(
        "Puntaje concurso robots", // Título
        dataset2, // Dataset
        true, // Mostrar leyenda
        true, // Usar tooltips
        false // Configurar para generar URLs
        );
    // Generar un archivo con el gráfico

        ChartPanel panel2 = new ChartPanel(chart2);
        panel2.setMouseWheelEnabled(true);
        panel2.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel2);
//        
    }
    
    public void graficoBarras()
    {
        DefaultCategoryDataset barras = new DefaultCategoryDataset();
        
        barras.setValue(6, "lluvas","Enero");   
        barras.setValue(9, "lluvas","Ferbero");   
        barras.setValue(2, "lluvas","Marzo");   
        barras.setValue(15, "lluvas","Abril");   
        barras.setValue(20, "lluvas","Mayo");   
        barras.setValue(25, "lluvas","Junio");
        barras.setValue(12, "lluvas","Julio");   
        barras.setValue(1, "lluvas","Agosto");   
        barras.setValue(0, "lluvas","Septiembre");   
        barras.setValue(31, "lluvas","Octubre");
        barras.setValue(17, "lluvas","Noviembre");   
        barras.setValue(0, "lluvas","Diciembre");   
               
         JFreeChart barras12 = ChartFactory.createBarChart(
                 "Cantidad de dias del año en los que llovió", 
                 "Meses del Año",
                 "Cantidad de dias de lluvia", 
                 barras, 
                 PlotOrientation.HORIZONTAL,
                 false, 
                 true, 
                 false);
                 
          ChartPanel panel2 = new ChartPanel(barras12);
        panel2.setMouseWheelEnabled(true);
        panel2.setPreferredSize (new Dimension (600,400));
        JOptionPane.showMessageDialog(rootPane, panel2);
    }
    
    public void graficolineas()
    {
        DefaultCategoryDataset lineas = new DefaultCategoryDataset();
        
        lineas.setValue(3, "nota","2013");   
        lineas.setValue(0.5, "nota","2014");   
        lineas.setValue(4, "nota","2015");   
        lineas.setValue(3, "nota","2016");   
        lineas.setValue(0, "nota","2017");   
        lineas.setValue(5, "nota","2018");
        lineas.setValue(4, "nota","2019");   
        lineas.setValue(3.5, "nota","2020");   
        lineas.setValue(2, "nota","2021");   
        lineas.setValue(0.1, "nota","2022");
        lineas.setValue(5, "nota","2023");   
        lineas.setValue(1, "nota","2024");   

                
         JFreeChart delineas = ChartFactory.createLineChart(
             "Perspectiva de notas de Pablo", 
             "Años", 
             "Nota autovalorativa", 
             lineas,
             PlotOrientation.VERTICAL,
             false,
             true, 
             false);

        
        ChartPanel panel2 = new ChartPanel(delineas);
        panel2.setMouseWheelEnabled(true);
        panel2.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel2);

    }
    
    public void graficoXY()
    {
          XYSeries series = new XYSeries("XYGraph");
        
        for (int i = 0; i < Integer.parseInt(FILAS.getText()); i++) 
        {
            for (int j = 0; j < Integer.parseInt(COLUMNAS.getText()); j++) 
           {
               series.add(i, Float.parseFloat(((String) Tabla1.getValueAt(i,j))));
           }
        }
        
        // Agregar las series de datos
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        // Generar el gráfico
        
        JFreeChart chart = ChartFactory.createXYLineChart(
        "Deformacion de un Material", // Título
        "Deformacion(%)", // etiqueta para el eje x
        "Tension(Mpa)", // etiqueta para el eje y
        dataset, // Dataset
        PlotOrientation.VERTICAL, // Orientación
        true, // Mostrar leyenda
        true, // Usar tooltips
        false // Configurar para generar URLs
        );
// Generar un archivo con el gráfico
        
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel);
    }

    public void G3D()
    {
        DefaultPieDataset dataset2 = new DefaultPieDataset();
        
        dataset2.setValue("Botzila", Integer.parseInt((String)Tabla1.getValueAt(0,1)));
        dataset2.setValue("Baymax", Integer.parseInt((String)Tabla1.getValueAt(1,1)));
        dataset2.setValue("WallE", Integer.parseInt((String)Tabla1.getValueAt(2,1)));
        dataset2.setValue("Astroboy", Integer.parseInt((String)Tabla1.getValueAt(3,1)));
        dataset2.setValue("Bender", Integer.parseInt((String)Tabla1.getValueAt(4,1)));
        dataset2.setValue("Atom", Integer.parseInt((String)Tabla1.getValueAt(5,1)));
        

        // Generar el gráfico
        
        JFreeChart charte = ChartFactory.createPieChart3D(
                "Concurso de robots", 
                dataset2,
                true, 
                true,
                false);

// Generar un archivo con el gráfico
        
        ChartPanel panel = new ChartPanel(charte);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel);
    }
    
    
    public void bubble()
    {
        
        System.out.println("entri1");
       DefaultXYZDataset burbuja = new DefaultXYZDataset();
       
       double [] ad = new double  [Integer.parseInt(FILAS.getText())] ;
       double [] ad1 = new double [Integer.parseInt(FILAS.getText())] ;
       double [] ad2 = new double [Integer.parseInt(FILAS.getText())] ;
       
        for (int i = 0; i < Integer.parseInt(FILAS.getText()); i++)
        {
            System.out.println("entro ad");
             ad [i] = Double.parseDouble((String)Tabla1.getValueAt(i,0)); 
        }
//        
        for (int i = 0; i < Integer.parseInt(FILAS.getText()); i++) 
        {
            System.out.println("enreo ad1");
             ad1 [i] = Double.parseDouble((String)Tabla1.getValueAt(i,1)); 
        } 
        
        for (int i = 0; i < Integer.parseInt(FILAS.getText()); i++) {
                System.out.println("enro ad2");
             ad2 [i] = Double.parseDouble((String)Tabla1.getValueAt(i,2)); 
        }   
      
       double ad3[][] = { ad , ad1 , ad2 };       

       
       burbuja.addSeries("algo", ad3);
       
       JFreeChart burbujitas = ChartFactory.createBubbleChart(
               "horas trabajadas", 
               "trabajo", 
               "dinero ganado", 
               burbuja, 
               PlotOrientation.HORIZONTAL, 
               true, 
               true, 
               false);
       
        ChartPanel panel = new ChartPanel(burbujitas);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel);

    }
    
    public void time()
    {
    
        TimeSeriesCollection tiempo = new TimeSeriesCollection();
                
        TimeSeries s1 = new TimeSeries("Protestas");
        
        s1.add(new Day(11, 5, 2015), 58.0824);
        s1.add(new Day(12, 5, 2015), 57.1161);
        s1.add(new Day(13, 5, 2015), 57.1640);
        s1.add(new Day(16, 5, 2015), 56.5258);
        s1.add(new Day(17, 5, 2015), 56.2603);
        s1.add(new Day(18, 5, 2015), 63.2634);
        s1.add(new Day(19, 5, 2015), 62.1595);
        s1.add(new Day(20, 5, 2015), 62.0915);
        s1.add(new Day(1, 5, 2015), 61.8449);
        s1.add(new Day(2, 5, 2015), 62.0382);
        s1.add(new Day(3, 5, 2015), 50.78);
        s1.add(new Day(4, 5, 2015), 50.82);
        s1.add(new Day(5, 5, 2015), 51.77);
        s1.add(new Day(10, 5, 2015), 51.30);
        s1.add(new Day(30, 5, 2015), 52.14);

//        
        tiempo.addSeries(s1);

        
        JFreeChart tiempito = ChartFactory.createTimeSeriesChart(
                "Cantidad de personas que participaron en protestas", 
                "Fecha", 
                "Numero", 
                tiempo, 
                true, 
                true, 
                false);
     
        
        ChartPanel panel = new ChartPanel(tiempito);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel);
        
    }
    
    public void interface1()
    {
         DefaultPieDataset dataset2 = new DefaultPieDataset();
        
        dataset2.setValue("Botzila", Integer.parseInt((String)Tabla1.getValueAt(0,1)));
        dataset2.setValue("Baymax", Integer.parseInt((String)Tabla1.getValueAt(1,1)));
        dataset2.setValue("WallE", Integer.parseInt((String)Tabla1.getValueAt(2,1)));
        dataset2.setValue("Astroboy", Integer.parseInt((String)Tabla1.getValueAt(3,1)));
        dataset2.setValue("Bender", Integer.parseInt((String)Tabla1.getValueAt(4,1)));
        dataset2.setValue("Atom", Integer.parseInt((String)Tabla1.getValueAt(5,1)));
        
    // Generar el gráfico 
        
        
        JFreeChart chart2 = ChartFactory.createPieChart(
        "Puntaje concurso robots archivo txt", // Título
        dataset2, // Dataset
        true, // Mostrar leyenda
        true, // Usar tooltips
        false // Configurar para generar URLs
        );
    // Generar un archivo con el gráfico

        ChartPanel panel2 = new ChartPanel(chart2);
        panel2.setMouseWheelEnabled(true);
        panel2.setPreferredSize (new Dimension (600,400));

        JOptionPane.showMessageDialog(rootPane, panel2);
    }
    
    
    
    
        public void Upload(File archivo)
    {
        FileReader leer = null;
        BufferedReader blector = null;
        
        try 
        {
            leer = new FileReader(archivo);
            blector = new BufferedReader(leer);
            
         String linea;

            Tabla1.addColumn("0");

            boolean titulos= true;
            while((linea = blector.readLine()) != null)
            {
                String Arreglo [] = linea.split(":");
                if (titulos == true)
                {
                    for (int i = 1; i < Arreglo.length; i++) 
                    {  
                        Tabla1.addColumn(i);
                    }
                    titulos= false;

                }
                Tabla1.addRow(Arreglo);
            }
            
             this.Tablita.setModel(Tabla1);
        }
        catch(Exception ex)
        {
                ex.printStackTrace();
        }
        finally
        {
            try
            {
                if(leer !=null)
                {
                    leer.close();
                    FILAS.setText(String.valueOf(Tabla1.getRowCount()));
                    COLUMNAS.setText(String.valueOf(Tabla1.getColumnCount()-1));
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piechart1 = new javax.swing.JButton();
        piechart2 = new javax.swing.JButton();
        Barchart = new javax.swing.JButton();
        ingrsarArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablita = new javax.swing.JTable();
        FILAS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        COLUMNAS = new javax.swing.JTextField();
        Borrar = new javax.swing.JToggleButton();
        xy = new javax.swing.JButton();
        Linea = new javax.swing.JButton();
        grafico3d = new javax.swing.JButton();
        bubble = new javax.swing.JButton();
        time = new javax.swing.JButton();
        interface1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        piechart1.setText("Piechart1");
        piechart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piechart1ActionPerformed(evt);
            }
        });

        piechart2.setText("Piechar2");
        piechart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piechart2ActionPerformed(evt);
            }
        });

        Barchart.setText("Barchart");
        Barchart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarchartActionPerformed(evt);
            }
        });

        ingrsarArchivo.setText("INGRESAR ARCHIVOS");
        ingrsarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingrsarArchivoActionPerformed(evt);
            }
        });

        Tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tablita);

        jLabel1.setText("X");

        Borrar.setText("BORRAR TABLA");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        xy.setText("XYchart");
        xy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xyActionPerformed(evt);
            }
        });

        Linea.setText("Linechart");
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaActionPerformed(evt);
            }
        });

        grafico3d.setText("3D Barrchart");
        grafico3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafico3dActionPerformed(evt);
            }
        });

        bubble.setText("Bubblechart");
        bubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleActionPerformed(evt);
            }
        });

        time.setText("TimeSerieschart");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        interface1.setText("FileInterface");
        interface1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interface1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FILAS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(COLUMNAS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(piechart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(piechart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Barchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Linea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grafico3d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interface1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingrsarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FILAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(COLUMNAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(piechart1)
                        .addGap(12, 12, 12)
                        .addComponent(piechart2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Barchart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Linea)
                        .addGap(10, 10, 10)
                        .addComponent(xy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grafico3d)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bubble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingrsarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrar)
                    .addComponent(interface1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingrsarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingrsarArchivoActionPerformed
       
        JFileChooser TraerArchivo = new  JFileChooser();
        FileNameExtensionFilter filtrotxt = new FileNameExtensionFilter ("Archivos tipo txt","txt");
        FileNameExtensionFilter filtroCSV = new FileNameExtensionFilter ("Archivos tipo csv","csv");
        TraerArchivo.setFileFilter(filtroCSV);
        TraerArchivo.setFileFilter(filtrotxt);
        
        int seleccionar = TraerArchivo.showOpenDialog(this);
        
        if (seleccionar == JFileChooser.APPROVE_OPTION)
        {
            File archivo = TraerArchivo.getSelectedFile();
            Upload(archivo);
        }
    }//GEN-LAST:event_ingrsarArchivoActionPerformed

    private void piechart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piechart1ActionPerformed
         graficopie1();
    }//GEN-LAST:event_piechart1ActionPerformed

    private void piechart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piechart2ActionPerformed
         graficopie2();
    }//GEN-LAST:event_piechart2ActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        FILAS.setText("");
        COLUMNAS.setText("");
        Tabla1.setColumnCount(0);
        Tabla1.setRowCount(0);
        this.Tablita.setModel(Tabla1);
    }//GEN-LAST:event_BorrarActionPerformed

    private void BarchartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarchartActionPerformed
        graficoBarras();
    }//GEN-LAST:event_BarchartActionPerformed

    private void xyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xyActionPerformed
        
        graficoXY();
    }//GEN-LAST:event_xyActionPerformed

    private void LineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaActionPerformed
        graficolineas();
    }//GEN-LAST:event_LineaActionPerformed

    private void grafico3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafico3dActionPerformed
       G3D();
    }//GEN-LAST:event_grafico3dActionPerformed

    private void bubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubbleActionPerformed
       bubble();
    }//GEN-LAST:event_bubbleActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
       time();
    }//GEN-LAST:event_timeActionPerformed

    private void interface1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interface1ActionPerformed
       interface1();
    }//GEN-LAST:event_interface1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(piechart11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(piechart11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(piechart11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piechart11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new piechart11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Barchart;
    private javax.swing.JToggleButton Borrar;
    private javax.swing.JTextField COLUMNAS;
    private javax.swing.JTextField FILAS;
    private javax.swing.JButton Linea;
    private javax.swing.JTable Tablita;
    private javax.swing.JButton bubble;
    private javax.swing.JButton grafico3d;
    private javax.swing.JButton ingrsarArchivo;
    private javax.swing.JButton interface1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton piechart1;
    private javax.swing.JButton piechart2;
    private javax.swing.JButton time;
    private javax.swing.JButton xy;
    // End of variables declaration//GEN-END:variables
}
