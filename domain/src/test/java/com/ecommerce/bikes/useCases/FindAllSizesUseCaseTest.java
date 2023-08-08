package com.ecommerce.bikes.useCases;

import com.ecommerce.bikes.SizeMother;
import com.ecommerce.bikes.domain.Size;
import com.ecommerce.bikes.repository.SizeRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindAllSizesUseCaseTest {


    private final SizeRepository sizeRepository = mock(SizeRepository.class);

    private final FindAllSizesUseCase findAllSizesUseCase = new FindAllSizesUseCase(sizeRepository);


    @Test
    public void find_all_sizes() {
        when(sizeRepository.findAll()).thenReturn(SizeMother.sizesDAO);

        List<Size> sizeList = findAllSizesUseCase.find();

        assertEquals(SizeMother.sizes, sizeList);
    }

}