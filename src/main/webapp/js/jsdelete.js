function del() {
    if (confirm("确定要删除吗？")) {
        return true;
    }
    else {
        return false;
    }
}

$("#skin_push_time").datetimepicker({
    language: 'zh-CN',//设置语言
    format: "yyyy-mm-dd",//设置格式
    autoclose: true,//选中自动关闭
    startView:4,// 设置开始视图   即 从年份选择
    todayBtn: true,//是否显示今日按钮
    minView: "month",//设置最小视图   即只显示到月份
});
