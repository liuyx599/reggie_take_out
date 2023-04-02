function loginApi(data) {
  return $axios({
    'url': '/employee/login',   // 控制层的请求 EmployeeController 中
    'method': 'post',
    data
  })
}

function logoutApi(){
  return $axios({
    'url': '/employee/logout',
    'method': 'post',
  })
}
