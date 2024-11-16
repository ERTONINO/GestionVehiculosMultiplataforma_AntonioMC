/********************************************************************************
 ** Form generated from reading ui file 'vehiculos.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Vehiculos implements com.trolltech.qt.QUiForm<QDialog>
{
    public QFrame frame;
    public QFrame frame_2;
    public QWidget widget;
    public QGridLayout gridLayout_2;
    public QLabel lbImagen;
    public QLabel lbPrecio;
    public QLabel lbFechaAlta;
    public QLabel lbUbicacion;
    public QComboBox cbTipoVehiculos_2;
    public QLabel lbDatosAlta;
    public QDateEdit deFechaAlta;
    public QSpinBox spinBox;
    public QWidget widget1;
    public QGridLayout gridLayout;
    public QComboBox cbTipoVehiculos;
    public QCheckBox cbCambioManual;
    public QLineEdit leCodigo;
    public QLabel lbDatoVehiculo;
    public QLabel lbEtInformativa;
    public QLabel lbCodigo;
    public QLabel lbTipoCambioManual;
    public QLabel lbTipoVehiculo;
    public QLabel lbTextoEtInformativa;
    public QRadioButton rbElectrico;
    public QRadioButton rbHibrido;
    public QRadioButton rbDiesel;
    public QRadioButton rbGasolina;
    public QLabel lbTipoMotor;
    public QCheckBox cbCambiar;
    public QPushButton btAceptar;
    public QPushButton BtCancelar;

    public Ui_Vehiculos() { super(); }

    public void setupUi(QDialog Vehiculos)
    {
        Vehiculos.setObjectName("Vehiculos");
        Vehiculos.resize(new QSize(816, 793).expandedTo(Vehiculos.minimumSizeHint()));
        frame = new QFrame(Vehiculos);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(10, 10, 800, 303));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(243, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(199, 226, 226));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(78, 98, 99));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(104, 131, 132));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(205, 226, 226));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(243, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(199, 226, 226));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(78, 98, 99));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(104, 131, 132));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(205, 226, 226));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(78, 98, 99));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(243, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(199, 226, 226));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(78, 98, 99));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(104, 131, 132));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(78, 98, 99));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(78, 98, 99));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(156, 197, 198));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        frame.setPalette(palette);
        frame.setAutoFillBackground(true);
        frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        frame_2 = new QFrame(Vehiculos);
        frame_2.setObjectName("frame_2");
        frame_2.setGeometry(new QRect(10, 340, 800, 370));
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(243, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(199, 226, 226));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(78, 98, 99));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(104, 131, 132));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(205, 226, 226));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(243, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(199, 226, 226));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(78, 98, 99));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(104, 131, 132));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(205, 226, 226));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(78, 98, 99));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(243, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(199, 226, 226));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(78, 98, 99));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(104, 131, 132));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(78, 98, 99));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(78, 98, 99));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(156, 197, 198));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        frame_2.setPalette(palette1);
        frame_2.setAutoFillBackground(true);
        frame_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_2.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        widget = new QWidget(frame_2);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(10, 40, 761, 283));
        gridLayout_2 = new QGridLayout(widget);
        gridLayout_2.setObjectName("gridLayout_2");
        lbImagen = new QLabel(widget);
        lbImagen.setObjectName("lbImagen");
        lbImagen.setPixmap(new QPixmap(("src/Imagenes/RME2.png")));
        lbImagen.setScaledContents(true);
        lbImagen.setWordWrap(false);

        gridLayout_2.addWidget(lbImagen, 0, 5, 4, 1);

        lbPrecio = new QLabel(widget);
        lbPrecio.setObjectName("lbPrecio");

        gridLayout_2.addWidget(lbPrecio, 2, 0, 1, 1);

        lbFechaAlta = new QLabel(widget);
        lbFechaAlta.setObjectName("lbFechaAlta");

        gridLayout_2.addWidget(lbFechaAlta, 1, 0, 1, 3);

        lbUbicacion = new QLabel(widget);
        lbUbicacion.setObjectName("lbUbicacion");

        gridLayout_2.addWidget(lbUbicacion, 3, 0, 1, 1);

        cbTipoVehiculos_2 = new QComboBox(widget);
        cbTipoVehiculos_2.setObjectName("cbTipoVehiculos_2");

        gridLayout_2.addWidget(cbTipoVehiculos_2, 3, 2, 1, 3);

        lbDatosAlta = new QLabel(widget);
        lbDatosAlta.setObjectName("lbDatosAlta");

        gridLayout_2.addWidget(lbDatosAlta, 0, 0, 1, 3);

        deFechaAlta = new QDateEdit(widget);
        deFechaAlta.setObjectName("deFechaAlta");
        deFechaAlta.setDateTime(new QDateTime(new QDate(2024, 1, 1), new QTime(0, 0, 0)));

        gridLayout_2.addWidget(deFechaAlta, 1, 3, 1, 1);

        spinBox = new QSpinBox(widget);
        spinBox.setObjectName("spinBox");

        gridLayout_2.addWidget(spinBox, 2, 3, 1, 1);

        widget1 = new QWidget(Vehiculos);
        widget1.setObjectName("widget1");
        widget1.setGeometry(new QRect(30, 40, 741, 238));
        gridLayout = new QGridLayout(widget1);
        gridLayout.setObjectName("gridLayout");
        gridLayout.setHorizontalSpacing(5);
        cbTipoVehiculos = new QComboBox(widget1);
        cbTipoVehiculos.setObjectName("cbTipoVehiculos");

        gridLayout.addWidget(cbTipoVehiculos, 6, 2, 1, 2);

        cbCambioManual = new QCheckBox(widget1);
        cbCambioManual.setObjectName("cbCambioManual");

        gridLayout.addWidget(cbCambioManual, 7, 3, 1, 1);

        leCodigo = new QLineEdit(widget1);
        leCodigo.setObjectName("leCodigo");

        gridLayout.addWidget(leCodigo, 2, 1, 2, 2);

        lbDatoVehiculo = new QLabel(widget1);
        lbDatoVehiculo.setObjectName("lbDatoVehiculo");

        gridLayout.addWidget(lbDatoVehiculo, 0, 0, 1, 6);

        lbEtInformativa = new QLabel(widget1);
        lbEtInformativa.setObjectName("lbEtInformativa");
        lbEtInformativa.setEnabled(false);

        gridLayout.addWidget(lbEtInformativa, 8, 0, 1, 3);

        lbCodigo = new QLabel(widget1);
        lbCodigo.setObjectName("lbCodigo");

        gridLayout.addWidget(lbCodigo, 2, 0, 2, 1);

        lbTipoCambioManual = new QLabel(widget1);
        lbTipoCambioManual.setObjectName("lbTipoCambioManual");

        gridLayout.addWidget(lbTipoCambioManual, 7, 0, 1, 3);

        lbTipoVehiculo = new QLabel(widget1);
        lbTipoVehiculo.setObjectName("lbTipoVehiculo");

        gridLayout.addWidget(lbTipoVehiculo, 6, 0, 1, 2);

        lbTextoEtInformativa = new QLabel(widget1);
        lbTextoEtInformativa.setObjectName("lbTextoEtInformativa");
        lbTextoEtInformativa.setEnabled(false);

        gridLayout.addWidget(lbTextoEtInformativa, 9, 0, 1, 5);

        rbElectrico = new QRadioButton(widget1);
        QButtonGroup buttonGroup_2 = new QButtonGroup(Vehiculos);
        buttonGroup_2.addButton(rbElectrico);
        rbElectrico.setObjectName("rbElectrico");

        gridLayout.addWidget(rbElectrico, 4, 5, 1, 1);

        rbHibrido = new QRadioButton(widget1);
        buttonGroup_2.addButton(rbHibrido);
        rbHibrido.setObjectName("rbHibrido");

        gridLayout.addWidget(rbHibrido, 4, 4, 1, 1);

        rbDiesel = new QRadioButton(widget1);
        buttonGroup_2.addButton(rbDiesel);
        rbDiesel.setObjectName("rbDiesel");

        gridLayout.addWidget(rbDiesel, 4, 3, 1, 1);

        rbGasolina = new QRadioButton(widget1);
        buttonGroup_2.addButton(rbGasolina);
        rbGasolina.setObjectName("rbGasolina");

        gridLayout.addWidget(rbGasolina, 4, 2, 1, 1);

        lbTipoMotor = new QLabel(widget1);
        lbTipoMotor.setObjectName("lbTipoMotor");

        gridLayout.addWidget(lbTipoMotor, 4, 0, 1, 2);

        cbCambiar = new QCheckBox(widget1);
        cbCambiar.setObjectName("cbCambiar");
        cbCambiar.setEnabled(false);

        gridLayout.addWidget(cbCambiar, 8, 3, 1, 1);

        btAceptar = new QPushButton(Vehiculos);
        btAceptar.setObjectName("btAceptar");
        btAceptar.setGeometry(new QRect(580, 736, 93, 28));

        btAceptar.clicked.connect(this, "mostrarMensaje()");

        BtCancelar = new QPushButton(Vehiculos);
        BtCancelar.setObjectName("BtCancelar");
        BtCancelar.setGeometry(new QRect(690, 736, 93, 28));

        BtCancelar.clicked.connect(Vehiculos, "close()");

        lbPrecio.setBuddy(spinBox);
        lbFechaAlta.setBuddy(deFechaAlta);
        lbUbicacion.setBuddy(cbTipoVehiculos_2);
        lbCodigo.setBuddy(leCodigo);
        lbTipoCambioManual.setBuddy(cbCambioManual);
        lbTipoVehiculo.setBuddy(cbTipoVehiculos);
        lbTipoMotor.setBuddy(rbGasolina);
        QWidget.setTabOrder(leCodigo, cbTipoVehiculos);
        QWidget.setTabOrder(cbTipoVehiculos, cbCambioManual);
        QWidget.setTabOrder(cbCambioManual, deFechaAlta);
        QWidget.setTabOrder(deFechaAlta, spinBox);
        QWidget.setTabOrder(spinBox, cbTipoVehiculos_2);
        QWidget.setTabOrder(cbTipoVehiculos_2, btAceptar);
        QWidget.setTabOrder(btAceptar, BtCancelar);
        retranslateUi(Vehiculos);
        cbCambioManual.clicked.connect(lbEtInformativa, "setEnabled(boolean)");
        cbCambioManual.clicked.connect(lbTextoEtInformativa, "setEnabled(boolean)");
        cbCambioManual.clicked.connect(cbCambiar, "setEnabled(boolean)");

        Vehiculos.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Vehiculos)
    {
        Vehiculos.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Veh\u00edculos", null));
        lbImagen.setText("");
        lbPrecio.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Lugar para calcular el precio", null));
        lbPrecio.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;Precio:</span></p></body></html>", null));
        lbFechaAlta.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Fecha de Alta", null));
        lbFechaAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;Fecha del alta:</span></p></body></html>", null));
        lbUbicacion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Ubicaci\u00f3n del veh\u00edculo, podremos conocer el sitio de su ubicaci\u00f3n", null));
        lbUbicacion.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;Ubicaci\u00f3n:</span></p></body></html>", null));
        cbTipoVehiculos_2.clear();
        cbTipoVehiculos_2.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Almac\u00e9n", null));
        cbTipoVehiculos_2.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Tienda", null));
        cbTipoVehiculos_2.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Taller", null));
        cbTipoVehiculos_2.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Elegir un sitio entre varias ubicaciones", null));
        lbDatosAlta.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Apartado de alta de datos", null));
        lbDatosAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-size:12pt; font-weight:600; text-decoration: underline;\">Datos del Alta</span></p></body></html>", null));
        deFechaAlta.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Introduzca la fecha de alta en el sistema", null));
        spinBox.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Elegir el precio", null));
        cbTipoVehiculos.clear();
        cbTipoVehiculos.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Turismo", null));
        cbTipoVehiculos.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Monovolumen", null));
        cbTipoVehiculos.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "SUV", null));
        cbTipoVehiculos.addItem(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Todoterreno", null));
        cbTipoVehiculos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Elegir tipo de veh\u00edculo", null));
        cbCambioManual.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Elegir si tipo de cambio es Manual. Se activar\u00e1 informaci\u00f3n importante y el texto en caso de cambio de cambio manual", null));
        cbCambioManual.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "aplicar", null));
        leCodigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Introduzca el c\u00f3digo del veh\u00edculo", null));
        lbDatoVehiculo.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-size:12pt; font-weight:600; text-decoration: underline;\">Datos de Veh\u00edculo</span></p></body></html>", null));
        lbEtInformativa.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Es informaci\u00f3n importante para el usuario por si el cambio es manual", null));
        lbEtInformativa.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-size:10pt; font-weight:600; text-decoration: underline;\">&amp;Informaci\u00f3n importante:</span></p></body></html>", null));
        lbCodigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "C\u00f3digo para identificar al veh\u00edculo", null));
        lbCodigo.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;C\u00f3digo:</span></p></body></html>", null));
        lbTipoCambioManual.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Para conocer el tipo de cambio.", null));
        lbTipoCambioManual.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">Tipo de &amp;cambio Manual:</span></p></body></html>", null));
        lbTipoVehiculo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Se elegir\u00e1 el tipo de veh\u00edculo", null));
        lbTipoVehiculo.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">Tipo de &amp;veh\u00edculo:</span></p></body></html>", null));
        lbTextoEtInformativa.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Informaci\u00f3n que incrementa el precio si se necesita el extra de cambio", null));
        lbTextoEtInformativa.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "El extra de cambio manual incrementa el precio en 500,00 \u20ac", null));
        rbElectrico.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Motor El\u00e9ctrico", null));
        rbElectrico.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "El\u00e9ctrico", null));
        rbHibrido.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Motor H\u00edbrido", null));
        rbHibrido.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "H\u00edbrido", null));
        rbDiesel.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Motor Disel", null));
        rbDiesel.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Diesel", null));
        rbGasolina.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Motor Gasolina", null));
        rbGasolina.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Gasolina", null));
        lbTipoMotor.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Elegiremos el tipo de motor", null));
        lbTipoMotor.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "<html><head/><body><p><span style=\" font-weight:600;\">Tipo de &amp;motor:</span></p></body></html>", null));
        cbCambiar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Elegir si tipo de cambio es Manual", null));
        cbCambiar.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Cambiar", null));
        btAceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Aceptar", null));
        BtCancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Vehiculos", "Cancelar", null));




    } // retranslateUi

    public void mostrarMensaje() {
        QMessageBox.information(null, "Guardado", "Registro guardado."); }
}

