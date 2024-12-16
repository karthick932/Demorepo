/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class DatasetUIWithUpdate_Test_A1EFBB8F0DA9BD43C75DB63362626162 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(1);
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public DatasetUIWithUpdate_Test_A1EFBB8F0DA9BD43C75DB63362626162(IContainer container, String invocationId) {
		super(container, "DatasetUIWithUpdate", invocationId, "A1EFBB8F0DA9BD43C75DB63362626162", "/UISample/Tests/DatasetUIWithUpdate.testsuite", "C:/Users/karthick_ba/HCL/devopstest/UITest1/UISample/Tests/DatasetUIWithUpdate.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(datapool_1(this));
	this.add(varAction_1(this));
		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);
		
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: DatasetUIWithUpdate_Test_A1EFBB8F0DA9BD43C75DB63362626162 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "Dataset1.csv", "A1EFBB952326EED0C75DB63362626162", false);
		Datapool dp = new Datapool(
				 "/L1VJU2FtcGxlL0RhdGFzZXRzL0RhdGFzZXQxLmNzdg==.csv",
				 "C:\\Users\\karthick_ba\\HCL\\devopstest\\UITest1\\UISample\\Datasets\\Dataset1.csv",
				 0,
				 false,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("Quantity", dcVars[0], false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EFBB8E0B3D1F9EC75DB63362626162");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1EFBB96748F4690C75DB63362626162",
				 0,
				 0,
				 0,
				 2,
				 1,
				 true, 
				 false,
				 null) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(datapool_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
	this.add(applicationContext_12(this));
	this.add(applicationContext_13(this));
	this.add(applicationContext_14(this));
	this.add(applicationContext_15(this));
	this.add(applicationContext_16(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start jpetstore.aspectran.com",
												  "A1EFBB8E0B447280C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>jpetstore.aspectran.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1EFBB8E0B447280C75DB63362626162\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"jpetstore.aspectran.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/jpetstore.aspectran.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign In - jpetstore.aspectran.com",
												  "A1EFBB8E0B495496C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0B495496C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:547;left:850;bottom:574;right:925\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 74, \\\"x\\\": 850, \\\"y\\\": 547 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(234, 172, 0);font-family:helvetica, tahoma, arial, verdana, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:74.6719px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(234, 172, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 574, \\\"color\\\": \\\"EAAC00FF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"helvetica, tahoma, arial, verdana, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signonForm\\\", \\\"left\\\": 850, \\\"line-height\\\": \\\"74.6719\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 925, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(234, 172, 0)\\\", \\\"top\\\": 547, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"335\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='MenuContent']\\\\\\/a[2]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is Username: - jpetstore.aspectran.com",
												  "A1EFBB8E0B5CB574C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0B5CB574C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":2780,\"isWeb\":false,\"description\":\"Think <i>2,780<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Username:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0B5CB574C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:354;left:630;bottom:413;right:1255\\\", \\\"Geometry\\\": { \\\"height\\\": 58, \\\"width\\\": 625, \\\"x\\\": 630, \\\"y\\\": 354 }, \\\"Style$array$\\\": \\\"background-color:rgb(254, 254, 254);background-repeat:repeat;color:rgb(10, 10, 10);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(10, 10, 10);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FEFEFEFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 413, \\\"color\\\": \\\"0A0A0AFF\\\", \\\"content\\\": \\\"j2ee\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"Username:\\\", \\\"left\\\": 630, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1255, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(10, 10, 10)\\\", \\\"top\\\": 354, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"j2ee\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"335\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/label\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'j2ee@test.com' in Edit text whose Label is Username: - jpetstore.aspectran.com",
												  "A1EFBB8E0B6DA572C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0B6DA572C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1575,\"isWeb\":false,\"description\":\"Think <i>1,575<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>j2ee@test.com<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Username:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0B6DA572C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"j2ee@test.com\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:354;left:630;bottom:413;right:1255\\\", \\\"Geometry\\\": { \\\"height\\\": 58, \\\"width\\\": 625, \\\"x\\\": 630, \\\"y\\\": 354 }, \\\"Style$array$\\\": \\\"background-color:rgb(254, 254, 254);background-repeat:repeat;color:rgb(10, 10, 10);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(10, 10, 10);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FEFEFEFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 413, \\\"color\\\": \\\"0A0A0AFF\\\", \\\"content\\\": \\\"j2ee\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"Username:\\\", \\\"left\\\": 630, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1255, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(10, 10, 10)\\\", \\\"top\\\": 354, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"j2ee\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"465\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/label\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'test' in Password field whose Label is Password: - jpetstore.aspectran.com",
												  "A1EFBB8E0B7C246BC75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0B7C246BC75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":10568,\"isWeb\":false,\"description\":\"Think <i>10,568<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>test<\\/b>' in <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0B7C246BC75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"test\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:477;left:630;bottom:536;right:1255\\\", \\\"Geometry\\\": { \\\"height\\\": 58, \\\"width\\\": 625, \\\"x\\\": 630, \\\"y\\\": 477 }, \\\"Style$array$\\\": \\\"background-color:rgb(254, 254, 254);background-repeat:repeat;color:rgb(10, 10, 10);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(10, 10, 10);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FEFEFEFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 536, \\\"color\\\": \\\"0A0A0AFF\\\", \\\"content\\\": \\\"j2ee\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"Password:\\\", \\\"left\\\": 630, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"password\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 1255, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(10, 10, 10)\\\", \\\"top\\\": 477, \\\"type\\\": \\\"password\\\", \\\"value\\\": \\\"j2ee\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"597\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/label[2]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Login - jpetstore.aspectran.com",
												  "A1EFBB8E0B88807BC75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0B88807BC75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1176,\"isWeb\":false,\"description\":\"Think <i>1,176<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Login<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0B88807BC75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Login\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:560;left:892;bottom:620;right:992\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 99, \\\"x\\\": 892, \\\"y\\\": 560 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 620, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Login\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 892, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 992, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 560, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"859\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Fish located at position 1 - jpetstore.aspectran.com",
												  "A1EFBB8E0B94B572C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0B94B572C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1473,\"isWeb\":false,\"description\":\"Think <i>1,473<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Fish<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0B94B572C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fish\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:177;left:707;bottom:210;right:781\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 74, \\\"x\\\": 707, \\\"y\\\": 177 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(67, 146, 26);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:10px;padding-right:10px;padding-top:0px;text-align:center;text-decoration:none solid rgb(67, 146, 26);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 210, \\\"color\\\": \\\"43921AFF\\\", \\\"content\\\": \\\"Fish\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/categories\\\\\\/FISH\\\", \\\"left\\\": 707, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 10, \\\"padding-right\\\": 10, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 781, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(67, 146, 26)\\\", \\\"top\\\": 177, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"379\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='QuickLinks']\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is FI-SW-01 - jpetstore.aspectran.com",
												  "A1EFBB8E0BA445CBC75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0BA445CBC75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1844,\"isWeb\":false,\"description\":\"Think <i>1,844<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>FI-SW-01<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0BA445CBC75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"FI-SW-01\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:242;left:435;bottom:275;right:533\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 97, \\\"x\\\": 435, \\\"y\\\": 242 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 187, 255);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(51, 187, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 275, \\\"color\\\": \\\"33BBFFFF\\\", \\\"content\\\": \\\"FI-SW-01\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/products\\\\\\/FI-SW-01\\\", \\\"left\\\": 435, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 533, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 187, 255)\\\", \\\"top\\\": 242, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"372\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Catalog']\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Url is /cart/addItemToCart?itemId=EST-1 - jpetstore.aspectran.com",
												  "A1EFBB8E0BB0A1E2C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0BB0A1E2C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1264,\"isWeb\":false,\"description\":\"Think <i>1,264<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Url<\\/b> is <b>\\/cart\\/addItemToCart?itemId=EST-1<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0BB0A1E2C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"href\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/cart\\/addItemToCart?itemId=EST-1\"},\"name\":\"href\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:241;left:1565;bottom:302;right:1724\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 159, \\\"x\\\": 1565, \\\"y\\\": 241 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 302, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Add to Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/cart\\\\\\/addItemToCart?itemId=EST-1\\\", \\\"left\\\": 1565, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1724, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 241, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"386\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Catalog']\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td[5]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '4' in Input field whose Label is false - jpetstore.aspectran.com",
												  "A1EFBB8E0BBF20D2C75DB63362626162",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"4\",\"key\":\"MOEB_FIELD\\/TPM:A1EFBB8E0BD037C7C75DB63362626162\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0BBF20D2C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":2227,\"isWeb\":false,\"description\":\"Think <i>2,227<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1EFBB8E0BD037C7C75DB63362626162\\\">4<\\/subst><\\/b>' in <b>Input field<\\/b> whose <b>Label<\\/b> is <b>false<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0BBF20D2C75DB63362626162\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1EFBB8E0BD037C7C75DB63362626162\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"4\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"false\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:542;left:823;bottom:601;right:1225\\\", \\\"Geometry\\\": { \\\"height\\\": 58, \\\"width\\\": 402, \\\"x\\\": 823, \\\"y\\\": 542 }, \\\"Style$array$\\\": \\\"background-color:rgb(254, 254, 254);background-repeat:repeat;color:rgb(10, 10, 10);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(10, 10, 10);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FEFEFEFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 601, \\\"color\\\": \\\"0A0A0AFF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"false\\\", \\\"left\\\": 823, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"3\\\", \\\"name\\\": \\\"EST-1\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlInput5Proxy\\\", \\\"proxyName\\\": \\\"inputtextfield\\\", \\\"right\\\": 1225, \\\"size\\\": \\\"3\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(10, 10, 10)\\\", \\\"top\\\": 542, \\\"type\\\": \\\"number\\\", \\\"value\\\": \\\"1\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"462\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Cart']\\\\\\/form\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td[5]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtextfield\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1EFBB8E0BD037C7C75DB63362626162", 0, 1, false, (IDCCoreVar)dcVars[0], false, "false", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Update Cart - jpetstore.aspectran.com",
												  "A1EFBB8E0BD037DBC75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0BD037DBC75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":461,\"isWeb\":false,\"description\":\"Think <i>461<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Update Cart<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0BD037DBC75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Update Cart\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:629;left:941;bottom:689;right:1107\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 166, \\\"x\\\": 941, \\\"y\\\": 629 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 689, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Update Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 941, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1107, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 629, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"651\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Cart']\\\\\\/form\\\\\\/table\\\\\\/tbody\\\\\\/tr[3]\\\\\\/td[2]\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Proceed to Checkout - jpetstore.aspectran.com",
												  "A1EFBB8E0BE127C2C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0BE127C2C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1335,\"isWeb\":false,\"description\":\"Think <i>1,335<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Proceed to Checkout<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0BE127C2C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Proceed to Checkout\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:279;left:815;bottom:339;right:1069\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 254, \\\"x\\\": 815, \\\"y\\\": 279 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 339, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Proceed to Checkout\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/order\\\\\\/newOrderForm\\\", \\\"left\\\": 815, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1069, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 279, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1025\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Cart']\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Continue - jpetstore.aspectran.com",
												  "A1EFBB8E0BF23EB4C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0BF23EB4C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1884,\"isWeb\":false,\"description\":\"Think <i>1,884<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Continue<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0BF23EB4C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Continue\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:58;left:815;bottom:118;right:951\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 136, \\\"x\\\": 815, \\\"y\\\": 58 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 118, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Continue\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 815, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 951, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 58, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"536\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='CenterForm']\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_14(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Confirm - jpetstore.aspectran.com",
												  "A1EFBB8E0C00BDB2C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0C00BDB2C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":1866,\"isWeb\":false,\"description\":\"Think <i>1,866<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Confirm<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0C00BDB2C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Confirm\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:196;left:829;bottom:257;right:956\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 126, \\\"x\\\": 829, \\\"y\\\": 196 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 257, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Confirm\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 829, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 956, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 196, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"545\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='CenterForm']\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_15(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign Out - jpetstore.aspectran.com",
												  "A1EFBB8E0C11AD94C75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBB8E0C11AD94C75DB63362626162\",\"preferredThinktime\":0,\"thinktime\":3746,\"isWeb\":false,\"description\":\"Think <i>3,746<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign Out<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0C11AD94C75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign Out\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:397;left:1034;bottom:424;right:1127\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 93, \\\"x\\\": 1034, \\\"y\\\": 397 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(234, 172, 0);font-family:helvetica, tahoma, arial, verdana, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:74.6719px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(234, 172, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 424, \\\"color\\\": \\\"EAAC00FF\\\", \\\"content\\\": \\\"Sign Out\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"helvetica, tahoma, arial, verdana, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signoff\\\", \\\"left\\\": 1034, \\\"line-height\\\": \\\"74.6719\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1127, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(234, 172, 0)\\\", \\\"top\\\": 397, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"535\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='MenuContent']\\\\\\/a[4]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_16(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - jpetstore.aspectran.com",
												  "A1EFBB8E0C229D8EC75DB63362626162",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBB8E0C229D8EC75DB63362626162\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/UISample/Tests/DatasetUIWithUpdate.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
