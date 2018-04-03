/**
 * Created by huguitao on 2018/4/3.
 */
function drawTableHead(headHtml) {
    var _html
        = '<table id="sample-table-1" class="table table-striped table-bordered table-hover">'
        + '<thead>'
        + headHtml
        + '</thead>' ;

    return _html;
}

function drawTableBody(dataList) {
    var _html = '<tbody>';
    for(var data in dataList){
        for(var index in dataList[data]){
            _html += '<td>' + dataList[data][index]+'</td>'
        }
        _html += '<td>'
            + '<div class="hidden-sm hidden-xs btn-group">'
            +     '<button class="btn btn-xs btn-success" title="">'
            +    '<i class="ace-icon fa fa-search-plus bigger-120"></i>'
            +   '</button>'
            +   '<button class="btn btn-xs btn-info">'
            +   '<i class="ace-icon fa fa-pencil bigger-120"></i>'
            +   '</button>'
            +    '<button class="btn btn-xs btn-danger">'
            +    '<i class="ace-icon fa fa-trash-o bigger-120"></i>'
            +   '</button>'

            +   '<button class="btn btn-xs btn-warning">'
            +    '<i class="ace-icon fa fa-flag bigger-120"></i>'
            +   '</button>'

            +   '<button class="btn btn-xs btn-success">'
            +   '<i class="ace-icon fa fa-check bigger-120"></i>'
            +   '</button>'
            +   '</div>'
            +   '</td>'
    }


    return _html;
}