package blog.anirbanm.viewsource.model.view;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat May 25 21:45:27 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SourceDemoVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        KeyAttr2,
        Attribute1,
        KeyAttr1;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int KEYATTR2 = AttributesEnum.KeyAttr2.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int KEYATTR1 = AttributesEnum.KeyAttr1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SourceDemoVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute KeyAttr1.
     * @return the KeyAttr1
     */
    public String getKeyAttr1() {
        return (String) getAttributeInternal(KEYATTR1);
    }

    /**
     * Gets the attribute value for the calculated attribute Attribute1.
     * @return the Attribute1
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Gets the attribute value for the calculated attribute KeyAttr2.
     * @return the KeyAttr2
     */
    public String getKeyAttr2() {
        return (String) getAttributeInternal(KEYATTR2);
    }
}

