
// ***** VDMTOOLS START Name=imports KEEP=NO
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class external_LightValListener {

// ***** VDMTOOLS START Name=parent KEEP=NO
  LightValListener parent = null;
// ***** VDMTOOLS END Name=parent


// ***** VDMTOOLS START Name=external_LightValListener#1|LightValListener KEEP=NO
  public external_LightValListener (LightValListener parentLightValListener) {
    parent = parentLightValListener;
  }
// ***** VDMTOOLS END Name=external_LightValListener#1|LightValListener


// ***** VDMTOOLS START Name=external_LightValListener KEEP=NO
  public external_LightValListener () {}
// ***** VDMTOOLS END Name=external_LightValListener


// ***** VDMTOOLS START Name=impl_getState KEEP=NO
  public Number impl_getState () /*throws CGException*/ {
    //UTIL.RunTime("Preliminary Operation getState has been called");
    return new Integer(0);
  }
// ***** VDMTOOLS END Name=impl_getState

}
;
