package _p148_Extraordinario;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    ArrayList<Producto> datos = new ArrayList<>();
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblClave, lblDescripcion, lblUnidadMedida, lblCantidad, lblPrecio, lblTotal, lblTipoPago;
    JTextField txtClave, txtDescripcion, txtUnidadMedida, txtCantidad, txtPrecio, txtTotal, txtTipoPago;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar, btnCalcularTotal;

    public App() {
        super("Datos de Productos");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);

        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);

        smnGuardar = new JMenuItem("Guardar");
        smnGuardar.addActionListener(this);
        mnuArchivo.add(smnGuardar);

        mnuArchivo.add(new JSeparator());

        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        mnuArchivo.add(smnSalir);

        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);

        smnAcercade = new JMenuItem("Acerca de ..");
        smnAcercade.addActionListener(this);
        mnuAyuda.add(smnAcercade);

        jdlAcercaDe = new JDialog(this, "Acerca de ..");
        jdlAcercaDe.setSize(300, 250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Carlos Gerardo Buendia</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1, 0, 0));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);

        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);

        table = new JTable();
        table.getTableHeader().setBackground(Color.gray);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Clave", "Descripcion", "UnidadMedida", "Cantidad", "Precio", "Total", "TipoPago"});
        table.setModel(modelo);

        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });

        getContentPane().add(pnlTabla);

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(10, 6, 0, 0));

        lblClave = new JLabel("Clave");
        lblClave.setHorizontalAlignment(SwingConstants.RIGHT);
        txtClave = new JTextField();
        pnlDatos.add(lblClave);
        pnlDatos.add(txtClave);

        lblDescripcion = new JLabel("Descripcion");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);

        lblUnidadMedida = new JLabel("UnidadMedida");
        lblUnidadMedida.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadMedida = new JTextField();
        pnlDatos.add(lblUnidadMedida);
        pnlDatos.add(txtUnidadMedida);

        lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad = new JTextField();
        pnlDatos.add(lblCantidad);
        pnlDatos.add(txtCantidad);

        lblPrecio = new JLabel("Precio:");
        lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecio = new JTextField();
        pnlDatos.add(lblPrecio);
        pnlDatos.add(txtPrecio);

        lblTotal = new JLabel("Total :");
        lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal = new JTextField();
        txtTotal.setEditable(false);  
        pnlDatos.add(lblTotal);
        pnlDatos.add(txtTotal);

        lblTipoPago = new JLabel("TipoPago :");
        lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTipoPago = new JTextField();
        pnlDatos.add(lblTipoPago);
        pnlDatos.add(txtTipoPago);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlDatos.add(btnAgregar);

        btnGrabar = new JButton("Grabar");
        btnGrabar.addActionListener(this);
        pnlDatos.add(btnGrabar);

        btnCalcularTotal = new JButton("Calcular Total");
        btnCalcularTotal.addActionListener(this);
        pnlDatos.add(btnCalcularTotal);

        cargarDatos();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                try {
                    datos = Util.desSerializarDatos(archivo.getAbsolutePath());
                    cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                try {
                    Util.serializarDatos(archivo.getAbsolutePath(), datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " + archivo.getAbsolutePath(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtClave.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        } else if (e.getSource() == btnCalcularTotal) {
            calcularTotal();
        }
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while (dm.getRowCount() > 0) dm.removeRow(0);
        Object[] obj = new Object[7];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getClave();
            obj[1] = datos.get(i).getDescripcion();
            obj[2] = datos.get(i).getUnidadMedida();
            obj[3] = datos.get(i).getCantidad();
            obj[4] = datos.get(i).getPrecio();
            obj[5] = datos.get(i).getTotal();
            obj[6] = datos.get(i).getTipoPago();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {
        if (!datos.isEmpty() && ren >= 0 && ren < datos.size()) {
            int clave = datos.get(ren).getClave();
            String Descripcion = datos.get(ren).getDescripcion();
            String UnidadMedida = datos.get(ren).getUnidadMedida();
            float Cantidad = datos.get(ren).getCantidad();
            float Precio = datos.get(ren).getPrecio();
            float Total = datos.get(ren).getTotal();
            String TipoPago = datos.get(ren).getTipoPago();

            txtClave.setText(Integer.toString(clave));
            txtDescripcion.setText(Descripcion);
            txtUnidadMedida.setText(UnidadMedida);
            txtCantidad.setText(Float.toString(Cantidad));
            txtPrecio.setText(Float.toString(Precio));
            txtTotal.setText(Float.toString(Total));
            txtTipoPago.setText(TipoPago);
        }
    }

    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents()) {
            if (cp instanceof JTextField) {
                cp.setEnabled(actdes);
            }
        }
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents()) {
            if (cp instanceof JTextField) {
                ((JTextField) cp).setText("");
            }
        }
    }

    public void guardarCampos() {
        Producto est = new Producto();
        est.setClave(Integer.parseInt(txtClave.getText()));
        est.setDescripcion(txtDescripcion.getText());
        est.setUnidadMedida(txtUnidadMedida.getText());
        est.setCantidad(Float.parseFloat(txtCantidad.getText()));
        est.setPrecio(Float.parseFloat(txtPrecio.getText()));

        float total = est.getCantidad() * est.getPrecio();
        est.setTotal(total);

        est.setTipoPago(txtTipoPago.getText());
        datos.add(est);
        cargarDatos();
    }

    
    public void calcularTotal() {
        try {
            float cantidad = Float.parseFloat(txtCantidad.getText());
            float precio = Float.parseFloat(txtPrecio.getText());
            float total = cantidad * precio;
            txtTotal.setText(Float.toString(total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos para Cantidad y Precio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.datos = Util.inicializarDatos();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.cargarDatos();
    }
}
