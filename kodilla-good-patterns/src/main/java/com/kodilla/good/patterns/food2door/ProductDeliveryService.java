package com.kodilla.good.patterns.food2door;

public class ProductDeliveryService {
    private final InformationFoodService informationFoodService;
    private final DeliveryService deliveryService;
    private final DeliveryRepository deliveryRepository;

    public ProductDeliveryService(final InformationFoodService informationFoodService,
                                  final DeliveryService deliveryService,
                                  final DeliveryRepository deliveryRepository) {
        this.informationFoodService = informationFoodService;
        this.deliveryService = deliveryService;
        this.deliveryRepository = deliveryRepository;
    }

    public executionOfContractDto assembly(final DeliveryCompletion deliveryCompletion) {

        boolean isCompleted = deliveryService.delivery(deliveryCompletion.getFoodProducer()
                , deliveryCompletion.getDeliveryRequest()
        );

        if (isCompleted) {
            informationFoodService.inform(deliveryCompletion.getFoodProducer()
                    , deliveryCompletion.getDeliveryRequest().getBuyer()
                    , deliveryCompletion.getDeliveryRequest().getFoodItem());

            deliveryRepository.createDelivery(deliveryCompletion.getFoodProducer()
                    , deliveryCompletion.getDeliveryRequest().getBuyer()
                    , deliveryCompletion.getDeliveryRequest().getFoodItem()
                    , deliveryCompletion.getDeliveryRequest().getOrderDate()
                    , deliveryCompletion.getDeliveryRequest().getDeliveryDate()
            );
            return new executionOfContractDto(deliveryCompletion.getFoodProducer()
                    , deliveryCompletion.getDeliveryRequest().getBuyer()
                    , deliveryCompletion.getDeliveryRequest().getFoodItem()
                    , true);
        } else {
            return new executionOfContractDto(deliveryCompletion.getFoodProducer()
                    , deliveryCompletion.getDeliveryRequest().getBuyer()
                    , deliveryCompletion.getDeliveryRequest().getFoodItem()
                    , false);
        }
    }
}
