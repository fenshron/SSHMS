/**
 * 输出保留指定小数位的值
 * @x 要转换的值
 * @maxDec 要保留的小数位
 */
function keep2w(x, maxDec) {
	var f = parseFloat(x);    
	if (isNaN(f)) {    
		return '0.00';    
	}    
	var f = Math.round(x*100)/100;    
	var s = f.toString();    
	var rs = s.indexOf('.');    
	if (rs < 0) {    
		rs = s.length;    
		s += '.';    
	}    
	while (s.length <= rs + 2) {    
		s += '0';    
	}    
	return s;    
}


//js获取项目根路径，如： http://localhost:8083/uimcardprj
function getRootPath(){
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    
    //按需求返回变量名
    return(projectName);
}


