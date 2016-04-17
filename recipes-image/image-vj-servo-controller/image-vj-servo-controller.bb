include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += "openssh \
                  vj-servo-controller \
"

IMAGE_LINGUAS = "en-us"

export IMAGE_BASENAME = "image-vj-servo-controller"
