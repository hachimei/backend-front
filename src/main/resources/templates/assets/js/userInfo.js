/**
 * Created by huguitao on 2018/4/3.
 */
function viewUserInfo() {
    var tableHead
        = '<tr>'
        + '<th>用户名</th>'
        + '<th>客舱级别</th>'
        + '<th class="hidden-480">行李数量上限</th>'
        + '<th>每件尺寸限制 </th>'
        + '<th class="hidden-480">'
        + '<i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>'
        + '每件重量上限</th>'
        +'<th class="hidden-480">操作</th>'
        + '</tr>';

    var _html = drawTableHead(tableHead)
    $('#mainPanel').html(_html)
    $.ajax({
        url:"/userInfo/userList.action",
        headers : {},
        dataType:"json",
        async:true,
        data:{},
        success : function(data) {
            _html += drawTableBody(data)
            $('#mainPanel').html(_html)
        },
        error : function() {
            _html += '数据加载异常!'
            $('#mainPanel').html(_html)
        }
    })
}