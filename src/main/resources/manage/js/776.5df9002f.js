"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[776],{9776:(e,l,n)=>{n.r(l),n.d(l,{default:()=>b});n(3134),n(307),n(9524);var t=n(7377),a=n(8479),o=n(1370),u=n(1290),i=function(e){return(0,t.dD)("data-v-700c3122"),e=e(),(0,t.Cn)(),e},r={class:"login_view"},s=i((function(){return(0,t._)("div",{class:"outTitle_view"},[(0,t._)("div",{class:"outTilte"},"Offer资讯交流Web系统登录")],-1)})),v={key:0,class:"tabView"},c=["onClick"],d={key:1,class:"list_item"},f=i((function(){return(0,t._)("div",{class:"list_label"}," 账号： ",-1)})),m={key:2,class:"list_item"},p=i((function(){return(0,t._)("div",{class:"list_label"}," 密码： ",-1)})),g=["onKeydown"],w={class:"btn_view"};const _={__name:"login",setup:function(e){var l,n=(0,u.iH)([]),i=(0,u.iH)([]),_=(0,u.iH)({role:"",username:"",password:""}),k=(0,u.iH)(""),h=(0,u.iH)(1),b=null===(l=(0,t.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,y=function(e){null===b||void 0===b||b.$router.push("/".concat(e,"Register"))},N=function(e){_.value.role=e},U=function(){if(_.value.username)if(_.value.password){if(n.value.length>1){if(!_.value.role)return null===b||void 0===b||b.$toolUtil.message("请选择角色","error"),void verifySlider.value.reset();for(var e=0;e<i.value.length;e++)i.value[e].roleName==_.value.role&&(k.value=i.value[e].tableName)}else k.value=n.value[0].tableName,_.value.role=n.value[0].roleName;$()}else null===b||void 0===b||b.$toolUtil.message("请输入密码","error");else null===b||void 0===b||b.$toolUtil.message("请输入用户名","error")},$=function(){null===b||void 0===b||b.$http({url:"".concat(k.value,"/login?username=").concat(_.value.username,"&password=").concat(_.value.password),method:"post"}).then((function(e){null===b||void 0===b||b.$toolUtil.storageSet("Token",e.data.token),null===b||void 0===b||b.$toolUtil.storageSet("role",_.value.role),null===b||void 0===b||b.$toolUtil.storageSet("sessionTable",k.value),null===b||void 0===b||b.$toolUtil.storageSet("adminName",_.value.username),null===b||void 0===b||b.$router.push("/")}),(function(e){}))},C=function(){var e={page:1,limit:1,sort:"id"};null===b||void 0===b||b.$http({url:"menu/list",method:"get",params:e}).then((function(e){i.value=JSON.parse(e.data.data.list[0].menujson);for(var l=0;l<i.value.length;l++)"是"==i.value[l].hasBackLogin&&n.value.push(i.value[l]);_.value.role=n.value[0].roleName,null===b||void 0===b||b.$toolUtil.storageSet("menus",JSON.stringify(i.value))}))},D=function(){C()};return(0,t.bv)((function(){D()})),function(e,l){var u=(0,t.up)("el-button"),i=(0,t.up)("el-form");return(0,t.wg)(),(0,t.iD)("div",null,[(0,t._)("div",r,[s,(0,t.Wm)(i,{model:_.value,class:"login_form"},{default:(0,t.w5)((function(){return[n.value.length>1?((0,t.wg)(),(0,t.iD)("div",v,[((0,t.wg)(!0),(0,t.iD)(t.HY,null,(0,t.Ko)(n.value,(function(e,l){return(0,t.wg)(),(0,t.iD)("div",{class:(0,a.C_)(["tab",_.value.role==e.roleName?"tabActive":""]),style:(0,a.j5)({width:"calc(100% / ".concat(n.value.length,")")}),key:l,onClick:function(l){return N(e.roleName)}},(0,a.zw)(e.roleName),15,c)})),128))])):(0,t.kq)("",!0),1==h.value?((0,t.wg)(),(0,t.iD)("div",d,[f,(0,t.wy)((0,t._)("input",{class:"list_inp","onUpdate:modelValue":l[0]||(l[0]=function(e){return _.value.username=e}),placeholder:"请输入账号"},null,512),[[o.nr,_.value.username]])])):(0,t.kq)("",!0),1==h.value?((0,t.wg)(),(0,t.iD)("div",m,[p,(0,t.wy)((0,t._)("input",{class:"list_inp","onUpdate:modelValue":l[1]||(l[1]=function(e){return _.value.password=e}),type:"password",placeholder:"请输入密码",onKeydown:(0,o.D2)(U,["enter","native"])},null,40,g),[[o.nr,_.value.password]])])):(0,t.kq)("",!0),(0,t._)("div",w,[1==h.value?((0,t.wg)(),(0,t.j4)(u,{key:0,class:"login",type:"success",onClick:U},{default:(0,t.w5)((function(){return[(0,t.Uk)("登录")]})),_:1})):(0,t.kq)("",!0),(0,t.Wm)(u,{class:"register",type:"primary",onClick:l[2]||(l[2]=function(e){return y("gongzuorenyuan")})},{default:(0,t.w5)((function(){return[(0,t.Uk)("注册工作人员")]})),_:1})])]})),_:1},8,["model"])])])}}};var k=n(7326);const h=(0,k.Z)(_,[["__scopeId","data-v-700c3122"]]),b=h}}]);
//# sourceMappingURL=776.5df9002f.js.map