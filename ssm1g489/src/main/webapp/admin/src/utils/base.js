const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1g489/",
            name: "ssm1g489",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1g489/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中小型人力资源管理系统"
        } 
    }
}
export default base
