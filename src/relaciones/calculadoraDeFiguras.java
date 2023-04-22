package relaciones;

public class calculadoraDeFiguras extends javax.swing.JFrame {

    public calculadoraDeFiguras() {
        initComponents();
        initLabels();
    }

    private void initLabels() {
        this.lblValorAreaCirculo.setText("0.00");
        this.lblValorPerimetroCirculo.setText("0.00");
        this.lblValorDiametro.setText("0.00");
        this.lblValorAreaCuadrado.setText("0.00");
        this.lblValorPerimetroCuadrado.setText("0.00");
        this.lblValorPerimetroInscrito.setText("0.00");
        this.lblValorAreaTriangulo.setText("0.00");
        this.lblValorPerimetroTriangulo.setText("0.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCirculo = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        lblDiametro = new javax.swing.JLabel();
        lblValorDiametro = new javax.swing.JLabel();
        jCirculo2 = new javax.swing.JPanel();
        lblAreaCirculo = new javax.swing.JLabel();
        lblPerimetroCirculo = new javax.swing.JLabel();
        lblValorAreaCirculo = new javax.swing.JLabel();
        lblValorPerimetroCirculo = new javax.swing.JLabel();
        jCuadrado = new javax.swing.JPanel();
        lblLado = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        lblPerimetroInscrito = new javax.swing.JLabel();
        lblValorPerimetroInscrito = new javax.swing.JLabel();
        jCuadrado2 = new javax.swing.JPanel();
        lblAreaCuadrado = new javax.swing.JLabel();
        lblPerimetroCuadrado = new javax.swing.JLabel();
        lblValorAreaCuadrado = new javax.swing.JLabel();
        lblValorPerimetroCuadrado = new javax.swing.JLabel();
        jTriangulo = new javax.swing.JPanel();
        lblBase = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        lblLadoA = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        txtLadoB = new javax.swing.JTextField();
        lblLadoB = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();
        lblLadoC = new javax.swing.JLabel();
        jTriangulo2 = new javax.swing.JPanel();
        lblAreaTriangulo = new javax.swing.JLabel();
        lblPerimetroTriangulo = new javax.swing.JLabel();
        lblValorAreaTriangulo = new javax.swing.JLabel();
        lblValorPerimetroTriangulo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCirculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Circulo"));

        lblRadio.setText("Radio");

        lblDiametro.setText("Diametro");

        lblValorDiametro.setText("0");

        jCirculo2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblAreaCirculo.setText("Área:");

        lblPerimetroCirculo.setText("Perimetro:");

        lblValorAreaCirculo.setText("0");

        lblValorPerimetroCirculo.setText("0");

        javax.swing.GroupLayout jCirculo2Layout = new javax.swing.GroupLayout(jCirculo2);
        jCirculo2.setLayout(jCirculo2Layout);
        jCirculo2Layout.setHorizontalGroup(
            jCirculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCirculo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCirculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAreaCirculo)
                    .addComponent(lblPerimetroCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCirculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorPerimetroCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(lblValorAreaCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jCirculo2Layout.setVerticalGroup(
            jCirculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCirculo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCirculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaCirculo)
                    .addComponent(lblValorAreaCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCirculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetroCirculo)
                    .addComponent(lblValorPerimetroCirculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jCirculoLayout = new javax.swing.GroupLayout(jCirculo);
        jCirculo.setLayout(jCirculoLayout);
        jCirculoLayout.setHorizontalGroup(
            jCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRadio)
                    .addComponent(lblDiametro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorDiametro, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtRadio))
                .addGap(46, 46, 46))
            .addComponent(jCirculo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jCirculoLayout.setVerticalGroup(
            jCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCirculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadio)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiametro)
                    .addComponent(lblValorDiametro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCirculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jCuadrado.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuadrado"));

        lblLado.setText("Lado");

        lblPerimetroInscrito.setText("Perimetro Inscrito:");

        lblValorPerimetroInscrito.setText("0");

        jCuadrado2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblAreaCuadrado.setText("Área:");

        lblPerimetroCuadrado.setText("Perimetro:");

        lblValorAreaCuadrado.setText("0");

        lblValorPerimetroCuadrado.setText("0");

        javax.swing.GroupLayout jCuadrado2Layout = new javax.swing.GroupLayout(jCuadrado2);
        jCuadrado2.setLayout(jCuadrado2Layout);
        jCuadrado2Layout.setHorizontalGroup(
            jCuadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCuadrado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCuadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAreaCuadrado)
                    .addComponent(lblPerimetroCuadrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCuadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorAreaCuadrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorPerimetroCuadrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jCuadrado2Layout.setVerticalGroup(
            jCuadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCuadrado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCuadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaCuadrado)
                    .addComponent(lblValorAreaCuadrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCuadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetroCuadrado)
                    .addComponent(lblValorPerimetroCuadrado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jCuadradoLayout = new javax.swing.GroupLayout(jCuadrado);
        jCuadrado.setLayout(jCuadradoLayout);
        jCuadradoLayout.setHorizontalGroup(
            jCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCuadradoLayout.createSequentialGroup()
                        .addComponent(lblLado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblPerimetroInscrito, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLado, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(lblValorPerimetroInscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addComponent(jCuadrado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jCuadradoLayout.setVerticalGroup(
            jCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCuadradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetroInscrito)
                    .addComponent(lblValorPerimetroInscrito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCuadrado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTriangulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Triangulo"));

        lblBase.setText("Base");

        lblAltura.setText("Altura");

        lblLadoA.setText("LadoA");

        lblLadoB.setText("LadoB");

        lblLadoC.setText("LadoC");

        jTriangulo2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblAreaTriangulo.setText("Área:");

        lblPerimetroTriangulo.setText("Perimetro:");

        lblValorAreaTriangulo.setText("0");

        lblValorPerimetroTriangulo.setText("0");

        javax.swing.GroupLayout jTriangulo2Layout = new javax.swing.GroupLayout(jTriangulo2);
        jTriangulo2.setLayout(jTriangulo2Layout);
        jTriangulo2Layout.setHorizontalGroup(
            jTriangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTriangulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTriangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAreaTriangulo)
                    .addComponent(lblPerimetroTriangulo))
                .addGap(43, 43, 43)
                .addGroup(jTriangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorAreaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(lblValorPerimetroTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTriangulo2Layout.setVerticalGroup(
            jTriangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTriangulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTriangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaTriangulo)
                    .addComponent(lblValorAreaTriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTriangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetroTriangulo)
                    .addComponent(lblValorPerimetroTriangulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jTrianguloLayout = new javax.swing.GroupLayout(jTriangulo);
        jTriangulo.setLayout(jTrianguloLayout);
        jTrianguloLayout.setHorizontalGroup(
            jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBase)
                    .addComponent(lblAltura)
                    .addComponent(lblLadoA)
                    .addComponent(lblLadoB)
                    .addComponent(lblLadoC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLadoC)
                    .addComponent(txtLadoB)
                    .addComponent(txtLadoA)
                    .addComponent(txtAltura)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addComponent(jTriangulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jTrianguloLayout.setVerticalGroup(
            jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTrianguloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBase)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoA)
                    .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoB)
                    .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoC)
                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTriangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jCirculo.getAccessibleContext().setAccessibleName("Circulo\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        datoDelCirculo();
        datosDelCuadrado();
        datosDelTriangulo();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void datoDelCirculo() throws NumberFormatException {
        Double radio = Double.parseDouble(txtRadio.getText());

        Circulo circulo = new Circulo(radio);
        Double diametroCirculo = circulo.calcularDiametro();
        Double areaCirculo = circulo.calcularArea();
        Double perimetroCirculo = circulo.calcularPerimetro();

        lblValorDiametro.setText(String.format("%.2f", diametroCirculo));
        lblValorAreaCirculo.setText(String.format("%.2f", areaCirculo));
        lblValorPerimetroCirculo.setText(String.format("%.2f", perimetroCirculo));
    }

    private void datosDelCuadrado() throws NumberFormatException {
        Double lado = Double.parseDouble(txtLado.getText());

        Cuadrado cuadrado = new Cuadrado(lado);
        Double calcularArea = cuadrado.calcularArea();
        Double calcularPerimetro = cuadrado.calcularPerimetro();
        Double calcularElPerimetroCuadrado = cuadrado.calcularElPerimetroCirculo();

        lblValorAreaCuadrado.setText(String.format("%.2f", calcularArea));
        lblValorPerimetroCuadrado.setText(String.format("%.2f", calcularPerimetro));
        lblValorPerimetroInscrito.setText(String.format("%.2f", calcularElPerimetroCuadrado));
    }

    private void datosDelTriangulo() throws NumberFormatException {
        Triangulo triangulo = new Triangulo();
        double altura = Double.parseDouble(txtAltura.getText());
        double base = Double.parseDouble(txtBase.getText());
        double ladoA = Double.parseDouble(txtLadoA.getText());
        double ladoB = Double.parseDouble(txtLadoB.getText());
        double ladoC = Double.parseDouble(txtLadoC.getText());

        triangulo.setAltura(altura);
        triangulo.setBase(base);
        triangulo.setLadoA(ladoA);
        triangulo.setLadoB(ladoB);
        triangulo.setLadoC(ladoC);

        lblValorAreaTriangulo.setText(String.format("%.2f", triangulo.calcularArea()));
        lblValorPerimetroTriangulo.setText(String.format("%.2f", triangulo.calcularPerimetro()));
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraDeFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JPanel jCirculo;
    private javax.swing.JPanel jCirculo2;
    private javax.swing.JPanel jCuadrado;
    private javax.swing.JPanel jCuadrado2;
    private javax.swing.JPanel jTriangulo;
    private javax.swing.JPanel jTriangulo2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAreaCirculo;
    private javax.swing.JLabel lblAreaCuadrado;
    private javax.swing.JLabel lblAreaTriangulo;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblDiametro;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblLadoA;
    private javax.swing.JLabel lblLadoB;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblPerimetroCirculo;
    private javax.swing.JLabel lblPerimetroCuadrado;
    private javax.swing.JLabel lblPerimetroInscrito;
    private javax.swing.JLabel lblPerimetroTriangulo;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblValorAreaCirculo;
    private javax.swing.JLabel lblValorAreaCuadrado;
    private javax.swing.JLabel lblValorAreaTriangulo;
    private javax.swing.JLabel lblValorDiametro;
    private javax.swing.JLabel lblValorPerimetroCirculo;
    private javax.swing.JLabel lblValorPerimetroCuadrado;
    private javax.swing.JLabel lblValorPerimetroInscrito;
    private javax.swing.JLabel lblValorPerimetroTriangulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoB;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
