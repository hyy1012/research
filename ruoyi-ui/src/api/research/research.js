import request from '@/utils/request'

// 查询主表列表
export function listResearch(query) {
  return request({
    url: '/research/research/list',
    method: 'get',
    params: query
  })
}

// 查询主表详细
export function getResearch(id) {
  return request({
    url: '/research/research/' + id,
    method: 'get'
  })
}

// 新增主表
export function addResearch(data) {
  return request({
    url: '/research/research',
    method: 'post',
    data: data
  })
}

// 修改主表
export function updateResearch(data) {
  return request({
    url: '/research/research',
    method: 'put',
    data: data
  })
}

// 删除主表
export function delResearch(id) {
  return request({
    url: '/research/research/' + id,
    method: 'delete'
  })
}
