/********************************************************************************
 ** Form generated from reading ui file 'principal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionSalir;
    public QAction actionAlta;
    public QAction actionBaja;
    public QWidget centralwidget;
    public QPushButton btNuevoVehiculo;
    public QPushButton btSalir;
    public QLabel lbfondo;
    public QMenuBar menubar;
    public QMenu menuArchivo;
    public QMenu menuVeh_culos;
    public QStatusBar statusbar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(848, 443).expandedTo(MainWindow.minimumSizeHint()));
        actionSalir = new QAction(MainWindow);
        actionSalir.setObjectName("actionSalir");
        actionAlta = new QAction(MainWindow);
        actionAlta.setObjectName("actionAlta");
        actionBaja = new QAction(MainWindow);
        actionBaja.setObjectName("actionBaja");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        btNuevoVehiculo = new QPushButton(centralwidget);
        btNuevoVehiculo.setObjectName("btNuevoVehiculo");
        btNuevoVehiculo.setGeometry(new QRect(740, 10, 93, 28));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(85, 170, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(212, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 127, 127));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(85, 170, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(212, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 127, 127));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(85, 170, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(212, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        btNuevoVehiculo.setPalette(palette);
        btNuevoVehiculo.setAutoFillBackground(true);
        btSalir = new QPushButton(centralwidget);
        btSalir.setObjectName("btSalir");
        btSalir.setGeometry(new QRect(740, 40, 93, 28));
        lbfondo = new QLabel(centralwidget);
        lbfondo.setObjectName("lbfondo");
        lbfondo.setGeometry(new QRect(-30, -10, 731, 441));
        lbfondo.setPixmap(new QPixmap(("src/Imagenes/fondo.png")));
        lbfondo.setScaledContents(true);
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 848, 26));
        menuArchivo = new QMenu(menubar);
        menuArchivo.setObjectName("menuArchivo");
        menuVeh_culos = new QMenu(menubar);
        menuVeh_culos.setObjectName("menuVeh_culos");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuArchivo.menuAction());
        menubar.addAction(menuVeh_culos.menuAction());
        menuArchivo.addAction(actionSalir);
        menuVeh_culos.addAction(actionAlta);
        menuVeh_culos.addAction(actionBaja);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        actionSalir.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir de la aplicaci\u00f3n", null));
        actionAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Alta", null));
        actionBaja.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Baja", null));
        btNuevoVehiculo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bot\u00f3n para registrar nuevo veh\u00edculo", null));
        btNuevoVehiculo.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nuevo Veh\u00edculo", null));
        btSalir.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bot\u00f3n para salir de la aplicaci\u00f3n", null));
        btSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        lbfondo.setText("");
        menuArchivo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Archivo", null));
        menuVeh_culos.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Veh\u00edculos", null));
    } // retranslateUi

}

