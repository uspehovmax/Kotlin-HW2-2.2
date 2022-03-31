package ru.netology

fun main() {

    val firstPost = Post(text = "First Post")
    val secondPost = Post(text = "Second Post", likes = 500)
    val thirdPost = Post(text = "Next Post", likes = 100, isFavorite = true)
    val updatedPost = Post(id = 3, text = "Update text", likes = 230, isFavorite = false)

    WallService.add(firstPost)
    WallService.add(secondPost)
    WallService.add(thirdPost)

    WallService.update(updatedPost)
    println("Update WallService: ${WallService.update(updatedPost)}")

    WallService.printPosts()
}


