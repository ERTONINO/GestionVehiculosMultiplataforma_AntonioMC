import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QMessageBox;

public class Main {
    public static void main(String[] args) {
        QApplication.initialize(args);
        // Crear la ventana principal
        //según el tipo de formulario que creemos en QTDesigner, esto puede ser QMainWindow o QDialog
        QMainWindow window = new QMainWindow();

        // Configurar la interfez de usuario
        Ui_MainWindow mainWindow = new Ui_MainWindow(); //la clase creada con QTJambi

        mainWindow.setupUi(window); //setupUi genera la interfaz

        // Conectar la acción "Salir" al cierre de la aplicación
        mainWindow.actionSalir.triggered.connect(QApplication.instance(), "quit()");

        // Conectar el botón "Salir" al cierre de la aplicación
        mainWindow.btSalir.clicked.connect(QApplication.instance(), "quit()");

//        // Conectar la acción "Alta" para abrir la ventana de Vehículos
//        mainWindow.actionAlta.triggered.connect(Main.class, "abrirVentanaVehiculos()");
//
//        // Conectar el botón "Nuevo Vehículo" para abrir la ventana de Vehículos
//        mainWindow.btNuevoVehiculo.clicked.connect(Main.class, "abrirVentanaVehiculos()");

        // Instancia de la clase Main para manejar las conexiones
        Main mainInstance = new Main();

        // Conectar la acción "Alta" para abrir la ventana de Vehículos
        mainWindow.actionAlta.triggered.connect(mainInstance, "abrirVentanaVehiculos()");
        // Conectar el botón "Nuevo Vehículo" para abrir la ventana de Vehículos
        mainWindow.btNuevoVehiculo.clicked.connect(mainInstance, "abrirVentanaVehiculos()");


        // Conectar el botón "baja y dar mensaje que no está realizado
        mainWindow.actionBaja.triggered.connect(mainInstance, "mostrarMensajeBaja()");

        // Mostrar la ventana.
        window.show();
        // Ejecutar el bucle de eventos.
        QApplication.execStatic();
    }
    // Método para abrir la ventana de vehículos
    private static void abrirVentanaVehiculos() {
        // Crear el diálogo para la ventana de vehículos
        QDialog ventanaVehiculos = new QDialog();
        //según el tipo de formulario que creemos

        // Crear la interfaz de usuario para la ventana de vehículos
        Ui_Vehiculos uiVehiculos = new Ui_Vehiculos();
        uiVehiculos.setupUi(ventanaVehiculos);

        // Mostrar el diálogo
        ventanaVehiculos.exec();
    }
    // Método para mostrar el mensaje de que la funcionalidad no está desarrollada
    private static void mostrarMensajeBaja() {
        // Crear un QMessageBox para mostrar el mensaje
        QMessageBox msgBox = new QMessageBox();
        msgBox.setIcon(QMessageBox.Icon.Information);
        msgBox.setWindowTitle("Funcionalidad No Desarrollada");
        msgBox.setText("La funcionalidad de Baja aún no está desarrollada.");
        msgBox.setStandardButtons(QMessageBox.StandardButton.Ok);

        // Mostrar el mensaje
        msgBox.exec();
    }
}
