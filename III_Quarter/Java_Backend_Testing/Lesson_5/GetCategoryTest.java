package ru.geekbrains.mini.market.lesson5Test;

import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import ru.geekbrains.mini.market.lesson5.dto.GetCategoryResponse;
import ru.geekbrains.mini.market.lesson5.service.CategoryService;
import ru.geekbrains.mini.market.lesson5.util.RetrofitUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategoryTest {
    static CategoryService categoryService;

    @BeforeAll
    static void beforeAll() {
        categoryService = RetrofitUtils
                .getRetrofit()
                .create(CategoryService.class);
    }

    @SneakyThrows
    @Test
    void getCategoryPositiveTest() {
        Response<GetCategoryResponse> response = categoryService
                .getCategory(1)
                .execute();

        assertThat(response.isSuccessful(), CoreMatchers.is(true));
        assertThat(response.body().getId(), equalTo(1));
        assertThat(response.body().getTitle(), equalTo("Food"));

        response.body().getProducts().forEach(product ->
                assertThat(product.getCategoryTitle(), equalTo("Food")));
    }
}
