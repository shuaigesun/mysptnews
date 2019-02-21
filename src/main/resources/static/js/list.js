;(function () {
    var myVue = new Vue({
        el:'.container',
        data:{
            pageInfo:{},
            id:'',
            title:'',
            summary:'',
            author:'',
            createdate:''
        },
        methods:{
            jump:function (page) {
                dataSearch(page);
            },
            search:function () {
                dataSearch();
            }
        },
        mounted:function(){
            dataLoad();
        }
    });
    function dataSearch(page) {
        page = page||1;
        var pm = {params:{}};
        pm.params['title'] = myVue.$data.title.trim();
        pm.params.cp=page;
        dataLoad(pm);
    }
    function dataLoad(pm) {
        pm = pm||{params:{}};
        axios.get('http://localhost:8080/search',pm).then(function (res) {
            for (var detail in res.data.list){
                var details = res.data.list[detail];
            }
            myVue.$data.pageInfo = res.data;
            console.log(myVue.$data.pageInfo)
        });
    }
})();
