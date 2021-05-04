package factories;

import checkboxes.Checkbox;
import buttons.Button;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}