package passwortverwaltungssoftware;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

/**
 * 
 * @author Kummer
 * 
 * In Anmeldung.java stehen verschiedene Methoden die einen Shortcut zu den Knopfdrücken 
 * darstellen, alles was da rein geschrieben wird passiert nach dem jeweiligen knopfdruck
 * 
 * Variablen:
 * Textfelder -> Name = txtName; Passwort = textPasswort;
 * 		-> txtName.getText(); <- Um Eingabe abzurufen
 *
 */



public class Gui {

	protected Shell shell;
    static Text txtName;
	static Text textPasswort;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void opengui() {
		try {
			Gui window = new Gui();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 350);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Button btnPasswortÄndern = new Button(shell, SWT.NONE);
		btnPasswortÄndern.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			
				//Wenn PasswortÄnderntaste gedrückt
				
				Anmeldung.PassChangeButton();
				
			}
		});
		btnPasswortÄndern.setBounds(97, 203, 122, 25);
		btnPasswortÄndern.setText("Passwort \u00E4ndern");
		
		txtName = new Text(shell, SWT.BORDER);
		txtName.setBounds(182, 128, 175, 21);
		
		Button btnNeuerAccount = new Button(shell, SWT.NONE);
		btnNeuerAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				//Wenn NeuerAccounttaste gedrückt
				
				Anmeldung.CreateAccButton();
				
			}
		});
		btnNeuerAccount.setBounds(235, 234, 122, 25);
		btnNeuerAccount.setText("Neuer Account");
		
		textPasswort = new Text(shell, SWT.BORDER);
		textPasswort.setBounds(182, 155, 175, 21);
		
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblName.setAlignment(SWT.CENTER);
		lblName.setBounds(97, 128, 79, 21);
		lblName.setText("Name:");
		
		Label lblPasswort = new Label(shell, SWT.NONE);
		lblPasswort.setText("Passwort:");
		lblPasswort.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblPasswort.setAlignment(SWT.CENTER);
		lblPasswort.setBounds(97, 155, 79, 21);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.BOLD));
		lblNewLabel.setBounds(0, 30, 434, 61);
		lblNewLabel.setText("ANMELDUNG");
		
		Button btnAnmelden = new Button(shell, SWT.NONE);
		btnAnmelden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {

				//Wenn Anmeldentaste gedrückt
				
				Anmeldung.SignInButton();
			}
		});
		btnAnmelden.setText("Anmelden");
		btnAnmelden.setBounds(235, 203, 122, 25);
		
		Button btnPasswortVergessen = new Button(shell, SWT.NONE);
		btnPasswortVergessen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				//Wenn Passwortvergessentaste gedrückt
				
				Anmeldung.PassLostButton();
				
			}
		});
		btnPasswortVergessen.setText("Passwort vergessen");
		btnPasswortVergessen.setBounds(97, 234, 122, 25);

	}
}
