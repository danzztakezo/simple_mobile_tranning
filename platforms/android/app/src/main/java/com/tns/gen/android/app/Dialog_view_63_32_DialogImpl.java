package com.tns.gen.android.app;

public class Dialog_view_63_32_DialogImpl extends android.app.Dialog implements com.tns.NativeScriptHashCodeProvider {
	public Dialog_view_63_32_DialogImpl(android.content.Context param_0){
		super(param_0);
		com.tns.Runtime.initInstance(this);
	}

	public Dialog_view_63_32_DialogImpl(android.content.Context param_0, int param_1){
		super(param_0, param_1);
		com.tns.Runtime.initInstance(this);
	}

	protected Dialog_view_63_32_DialogImpl(android.content.Context param_0, boolean param_1, android.content.DialogInterface.OnCancelListener param_2){
		super(param_0, param_1, param_2);
		com.tns.Runtime.initInstance(this);
	}

	public void onBackPressed()  {
		java.lang.Object[] args = null;
		com.tns.Runtime.callJSMethod(this, "onBackPressed", void.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
