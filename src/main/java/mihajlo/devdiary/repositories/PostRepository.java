package mihajlo.devdiary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mihajlo.devdiary.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
