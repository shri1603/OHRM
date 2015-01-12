var authBundleExists = false ; //TRINITY-1501.I

function fetchServices(){
	var bundleTypeId = document.getElementById('bundleTypeId').value;
	if(bundleTypeId != '-1' && bundleTypeId != 'A'){
		formatAuthEleAndMsg(true) ; // TRINITY-1501.I
		Filter.fetchServices(bundleTypeId,{
			callback:populateServices,
			errorHandler:errHandler});
	}
	//TRINITY-1501.I.B
	if(bundleTypeId == 'A') {
		formatAuthEleAndMsg(false) ;
	}
	//TRINITY-1501.I.E
}

function populateServices(data){
	dwr.util.removeAllOptions('services');
	if(data != null && data.length > 0){
		dwr.util.addOptions('services',data, 'serviceId', 'serviceName');
	}
}
function editBundle(bundleId){
	var form = document.getElementById('addBundleForm');
	document.getElementById('action').value = 'editBundle';
	document.getElementById('editBundleId').value = bundleId;
	form.submit();
}

function deleteBundle(bundleId){
	document.getElementById('editBundleId').value = bundleId;
	Filter.checkForBundleMapping(bundleId, {
		callback:checkMappingCallBack,
		errorHandler:errHandler});
}

function checkMappingCallBack(data){
	if(data == true){
		alert('Unable to delete the bundle as it is already mapped to a Subscription Type.');
	}
	else{
		if(window.confirm("Do you want to delete the bundle?")){
			document.getElementById('action').value = 'deleteBundle';
			document.getElementById('addBundleForm').submit();
		}
	}
}

function backToSBAdmin(formId){
	var form = document.getElementById(formId);
	form.action = "sbadmin.jsp";
	form.submit();
}

function performAction(formId,actionText){
	var form = document.getElementById(formId);
	document.getElementById('action').value = actionText;
	form.submit();
}

function deletePreviewBundle(bundleId){
	document.getElementById('deleteBundleId').value = bundleId;
	Filter.checkForBundleMapping(bundleId, {
		callback:checkPreviewMappingCallBack,
		errorHandler:errHandler});
}

function checkPreviewMappingCallBack(data){
	if(data == true){
		alert('Unable to delete the bundle as it is already mapped to a Subscription Type.');
	}
	else{
		if(window.confirm("Do you want to delete the bundle?")){
			document.getElementById('action').value = 'deleteBundle';
			document.getElementById('addPreviewBundleForm').submit();
		}
	}
}

function errHandler(msg, exc) {
	alert('Session timed out. Please re-login.');
}

function formatAuthEleAndMsg(reset) {
	if(!reset) {
		if(!authBundleExists){
//			document.getElementById('errMsg').innerHTML = '' ;
			document.getElementById('authNote').style.display = '' ; 
			document.getElementById('authConfig').style.display = 'none' ; 
		}
		else {
//			document.getElementById('errMsg').innerHTML = '' ;
			document.getElementById('authNote').style.display = 'none' ; 
			document.getElementById('authConfig').style.display = '' ; 
			document.getElementById('addBtn').disabled = true ;
		}
		dwr.util.removeAllOptions('services') ;
	}
	else {
		document.getElementById('authNote').style.display = 'none' ; 
		document.getElementById('authConfig').style.display = 'none' ; 
		document.getElementById('addBtn').disabled = false ;
	}
	document.getElementById('errMsg').innerHTML = '' ;
	document.getElementById('bundleCode').value = '' ;
	document.getElementById('bundleDesc').value = '' ;
}