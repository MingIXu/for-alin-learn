const basePath = 'http://localhost:8080/'
const api = {
    list: {
        method: 'get',
        url: '/user/page/',
    },
    delete: {
        method: 'get',
        url: '/user/delete/',
    },
    createOrUpdate:{
        method: 'post',
        url: '/user/createOrUpdate/',
    },
    read:{
        method: 'get',
            url: '/user/read/',
    }
}
