// 삭제 기능
const deleteButton = document.getElementById('delete-btn');

if (deleteButton != null) {
    deleteButton.addEventListener('click', event => {
        let id = document.getElementById('article-id').value;
        fetch('/api/articles/' + id, {
            method: 'DELETE'
        })
            .then((response) => {
                alert('삭제가 완료되었습니다.');
                location.replace('/articles');
            });
    });
}
